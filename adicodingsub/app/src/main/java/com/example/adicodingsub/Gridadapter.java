package com.example.adicodingsub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Gridadapter extends RecyclerView.Adapter<Gridadapter.GridViewHolder> {
    private ArrayList<DMNS> list;
    private OnItemClickCallback onItemClickCallback;


    public Gridadapter(ArrayList<DMNS> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new GridViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull Gridadapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(list.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });


    }
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(DMNS data);
    }
}
