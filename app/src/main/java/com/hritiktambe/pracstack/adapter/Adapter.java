package com.hritiktambe.pracstack.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hritiktambe.pracstack.R;
import com.hritiktambe.pracstack.models.Items;
import com.hritiktambe.pracstack.models.OwnerProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Items> items;
    private Context context;

    public Adapter(List<Items> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holders, int i) {
        final MyViewHolder holder = holders;
        OwnerProfile ownerProfile = items.get(i).getOwner();
        Items model = items.get(i);

        holder.profileName.setText(ownerProfile.getDisplayName());
        holder.qt.setText(model.getTitle());
        holder.votes.setText(model.getScore());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView votes, qt, content , profileName;
        ImageView contentImage, profilePic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            votes = itemView.findViewById(R.id.no_of_votes);
            qt = itemView.findViewById(R.id.qt);
            content = itemView.findViewById(R.id.content);
            profileName = itemView.findViewById(R.id.profile_name);
            contentImage = itemView.findViewById(R.id.content_image);
            profilePic = itemView.findViewById(R.id.profile_pic);

        }
    }


}
