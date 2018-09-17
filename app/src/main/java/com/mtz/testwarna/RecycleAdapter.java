package com.mtz.testwarna;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mtz.testwarna.dao.GiveawayDAO;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private List<GiveawayDAO> list;

    public RecycleAdapter(List<GiveawayDAO> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtUsername, txtContent;
        private Button btnJoin;
        private ImageView imageGiveaway, imageUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
