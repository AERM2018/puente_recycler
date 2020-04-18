package com.jpg.drawer_user;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.listViewHolder> {

    public static class listViewHolder  extends RecyclerView.ViewHolder{

        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView image = (ImageView) itemView.findViewById(R.id.img);
            TextView text_Info = (TextView) itemView.findViewById(R.id.tvInfo);
        }

        //public listViewHolder(ArrayList<>);
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
