package com.example.yougourta.projmob.Detail;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.yougourta.projmob.R;

import java.util.ArrayList;

/**
 * Created by Yougourta on 3/25/17.
 */

public class DetailPhotosAdapter extends RecyclerView.Adapter<DetailPhotosAdapter.ViewHolder>
{
    private ArrayList<Integer> photos;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imageViewLigneDetail);
        }
    }

    public DetailPhotosAdapter(ArrayList<Integer> photos) {
        this.photos = photos;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public DetailPhotosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_ligne_photos, parent, false);

        DetailPhotosAdapter.ViewHolder vh = new DetailPhotosAdapter.ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(DetailPhotosAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(photos.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return photos.size();
    }
}
