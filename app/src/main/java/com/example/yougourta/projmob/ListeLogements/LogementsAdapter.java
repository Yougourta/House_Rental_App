package com.example.yougourta.projmob.ListeLogements;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yougourta.projmob.Classes.Logement;
import com.example.yougourta.projmob.R;

import java.util.ArrayList;

/**
 * Created by Yougourta on 3/23/17.
 */

public class LogementsAdapter extends RecyclerView.Adapter<LogementsAdapter.ViewHolder> {

    private ArrayList<Logement> logements;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public TextView prix;
        public TextView surface;
        public TextView adresse;
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            prix = (TextView) view.findViewById(R.id.prixLigne);
            surface = (TextView) view.findViewById(R.id.surfaceLigne);
            adresse = (TextView) view.findViewById(R.id.adresseLigne);
            imageView = (ImageView) view.findViewById(R.id.imageViewLigne);
        }
    }

    public LogementsAdapter(ArrayList<Logement> logements) {
        this.logements = logements;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public LogementsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_logements_ligne, parent, false);

        // set the view's size, margins, paddings and layout parameters
        //...

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.prix.setText(String.valueOf(logements.get(position).getPrixLogement())+" Da/Mois");
        holder.surface.setText(logements.get(position).getTitreLogement()+", "+logements.get(position).getTypeLogement()+", "+String.valueOf(logements.get(position).getSurfaceLogement())+" m2");
        holder.adresse.setText(logements.get(position).getAdrLogement());
        holder.imageView.setImageResource(logements.get(position).getImages().get(0));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return logements.size();
    }
}
