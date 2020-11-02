package com.pmadera.mascotas.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pmadera.mascotas.R;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptadorPerfil extends RecyclerView.Adapter<MascotaAdaptadorPerfil.MascotaPerfilViewHolder>{
    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptadorPerfil(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }


    @NonNull
    @Override
    public MascotaPerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil,parent,false);


        
        return new MascotaPerfilViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull final MascotaPerfilViewHolder holder, int position) {
        final Mascota oMascota=mascotas.get(position);

        holder.imgFotoPerfil.setImageResource(oMascota.getFoto());
        holder.tvNombreMascotaCVPerfil.setText(oMascota.getNombre());
        holder.tvCantidadRaitingCVFavoritos.setText(Integer.toString( oMascota.getCantRaiting()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }



    public static class MascotaPerfilViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoPerfil;
        private TextView tvNombreMascotaCVPerfil;
        private TextView tvCantidadRaitingCVFavoritos;


        public MascotaPerfilViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFotoPerfil=(ImageView)itemView.findViewById(R.id.imgFotoPerfil);

            tvNombreMascotaCVPerfil=(TextView)itemView.findViewById(R.id.tvNombreMascotaPerfil);

            tvCantidadRaitingCVFavoritos=(TextView)itemView.findViewById(R.id.tvCantidadRaitingCVFavoritos);


        }


    }

}
