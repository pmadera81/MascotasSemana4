package com.pmadera.mascotas.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pmadera.mascotas.R;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);


        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolderholder, int position) {
        final Mascota oMascota=mascotas.get(position);

        mascotaViewHolderholder.imgFoto.setImageResource(oMascota.getFoto());
        mascotaViewHolderholder.tvNombreMascotaCV.setText(oMascota.getNombre());


            //aca incremento raiting
            mascotaViewHolderholder.btnRaitearCV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    oMascota.incrementarRaiting();
                    mascotaViewHolderholder.tvCantidadRaitingCV.setText(Integer.toString(oMascota.getCantRaiting()));
                }
            });




    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private ImageButton btnRaitearCV;
        private TextView tvNombreMascotaCV;
        private TextView tvCantidadRaitingCV;
        private ImageButton btnCantRaitingCV;
        private FloatingActionButton btnTopFive;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto=(ImageView)itemView.findViewById(R.id.imgFoto);
            btnRaitearCV=(ImageButton)itemView.findViewById(R.id.btnRaitearCV);
            tvNombreMascotaCV=(TextView)itemView.findViewById(R.id.tvNombreMascotaCV);
            tvCantidadRaitingCV=(TextView)itemView.findViewById(R.id.tvCantidadRaitingCV);
            btnCantRaitingCV=(ImageButton)itemView.findViewById(R.id.btnCantRaitingCV);
            btnTopFive=(FloatingActionButton)itemView.findViewById(R.id.btnTopFive);


        }


    }

}
