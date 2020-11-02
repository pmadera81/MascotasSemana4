package com.pmadera.mascotas.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pmadera.mascotas.R;
import com.pmadera.mascotas.adapter.MascotaAdaptadorFavoritos;
import com.pmadera.mascotas.adapter.MascotaAdaptadorPerfil;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotasPerfil;
    private ImageView imgFotoPerfilPrincipal;
    private TextView tvNombreMascotaPerfilPrincipal;


    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_perfil,container,false);




        //********************************************
        rvMascotasPerfil = (RecyclerView) v.findViewById(R.id.rvMascotasPerfil);

        GridLayoutManager glm=new GridLayoutManager(getActivity(),3);

        rvMascotasPerfil.setLayoutManager(glm);
        //********************************************


        CargoMascotas();

        CargoAdaptador();


        //datos principales
        imgFotoPerfilPrincipal=(ImageView)v.findViewById(R.id.imgFotoPerfilPrincipal);
        tvNombreMascotaPerfilPrincipal=(TextView)v.findViewById(R.id.tvNombreMascotaPerfilPrincipal);

        Mascota oMascota=mascotas.get(2);

        imgFotoPerfilPrincipal.setImageResource(oMascota.getFoto());
        tvNombreMascotaPerfilPrincipal.setText(oMascota.getNombre());


        // Inflate the layout for this fragment
        return v;
    }

    private void CargoMascotas() {


        mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Chico", "Beagle", 2010, "Blanco", R.drawable.chico));
        mascotas.get(0).setCantRaiting(5);

        mascotas.add(new Mascota("Coco", "Dálmata", 2010, "Amarillo", R.drawable.coco));
        mascotas.get(1).setCantRaiting(4);

        mascotas.add(new Mascota("Mico", "Cocker Spaniel", 2010, "Amarillo", R.drawable.mico));
        mascotas.get(2).setCantRaiting(6);

        mascotas.add(new Mascota("Nico", "Schnauzer", 2010, "Amarillo", R.drawable.nico));
        mascotas.get(3).setCantRaiting(2);

        mascotas.add(new Mascota("Simba", "Pug", 2010, "Amarillo", R.drawable.simba));
        mascotas.get(4).setCantRaiting(10);


    }

    private void CargoAdaptador() {

        MascotaAdaptadorPerfil oAdaptador=new MascotaAdaptadorPerfil(mascotas,getActivity());
        rvMascotasPerfil.setAdapter(oAdaptador);
    }
}