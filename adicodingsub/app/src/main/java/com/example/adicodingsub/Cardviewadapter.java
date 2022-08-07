package com.example.adicodingsub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Cardviewadapter extends RecyclerView.Adapter<Cardviewadapter.CardViewViewHolder> {
    private ArrayList<DMNS> list;
    public Cardviewadapter(ArrayList<DMNS> list){
        this.list = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        DMNS DMNS = list.get(position);
        Glide.with(holder.itemView.getContext())
                .load(DMNS.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(DMNS.getName());
        holder.tvDetail.setText(DMNS.getDetail());

        holder.read_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "You chose " +
                        list.get(holder.getAdapterPosition()).getFavoritename(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
            ImageView imgPhoto;
            TextView tvName, tvDetail;
            Button read_more;

            CardViewViewHolder(View itemView){
                super(itemView);
                imgPhoto = itemView.findViewById(R.id.img_item_photo);
                tvName = itemView.findViewById(R.id.tv_item_name);
                tvDetail = itemView.findViewById(R.id.tv_item_detail);
                read_more = itemView.findViewById(R.id.read_more);
            }
        }
    }


