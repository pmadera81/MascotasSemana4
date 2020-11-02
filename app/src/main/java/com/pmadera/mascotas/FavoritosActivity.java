package com.pmadera.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.widget.Adapter;

import com.google.android.material.tabs.TabLayout;
import com.pmadera.mascotas.Fragment.FavoritosFragment;
import com.pmadera.mascotas.Fragment.PerfilFragment;
import com.pmadera.mascotas.adapter.PageAdapter;


import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


            toolbar = (Toolbar) findViewById(R.id.miActionBar);
            setSupportActionBar(toolbar);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            tabLayout = (TabLayout) findViewById(R.id.tabLayout);
            viewPager = (ViewPager) findViewById(R.id.viewPager);



            setUpViewPager();

            if (toolbar != null) {
                setSupportActionBar(toolbar);
            }



    }

    private ArrayList<Fragment> agregarFragment(){
        ArrayList<Fragment> fragments=new ArrayList<>();

        fragments.add(new FavoritosFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){


        PageAdapter pa = new PageAdapter(getSupportFragmentManager(), 1, agregarFragment());

        viewPager.setAdapter(pa);


        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.home);
        tabLayout.getTabAt(1).setIcon(R.drawable.perro);
    }



}