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

import com.pmadera.mascotas.R;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptadorFavoritos extends RecyclerView.Adapter<MascotaAdaptadorFavoritos.MascotaFavoritaViewHolder>{
    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptadorFavoritos(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaFavoritaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favoritos,parent,false);


        return new MascotaFavoritaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaFavoritaViewHolder mascotaViewHolderholder, int position) {
        final Mascota oMascota=mascotas.get(position);

        mascotaViewHolderholder.imgFotoFavoritos.setImageResource(oMascota.getFoto());
        mascotaViewHolderholder.tvNombreMascotaCVFavoritos.setText(oMascota.getNombre());
        mascotaViewHolderholder.tvCantidadRaitingCVFavoritos.setText(Integer.toString(oMascota.getCantRaiting()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaFavoritaViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFotoFavoritos;
        private ImageButton btnRaitearCVFavoritos;
        private TextView tvNombreMascotaCVFavoritos;
        private TextView tvCantidadRaitingCVFavoritos;
        private ImageButton btnCantRaitingCVFavoritos;


        public MascotaFavoritaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFotoFavoritos=(ImageView)itemView.findViewById(R.id.imgFotoFavoritos);
            btnRaitearCVFavoritos=(ImageButton)itemView.findViewById(R.id.btnRaitearCVFavoritos);
            tvNombreMascotaCVFavoritos=(TextView)itemView.findViewById(R.id.tvNombreMascotaFavorito);
            tvCantidadRaitingCVFavoritos=(TextView)itemView.findViewById(R.id.tvCantidadRaitingCVFavoritos);
            btnCantRaitingCVFavoritos=(ImageButton)itemView.findViewById(R.id.btnCantRaitingCVFavoritos);



        }


    }

}
