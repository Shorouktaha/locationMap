package com.example.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.location.R;
import com.example.model.hospitalModel;

import java.util.List;

public class hospitalAdapter  extends RecyclerView.Adapter<hospitalAdapter.holder>{
    private List<hospitalModel> data;

    public hospitalAdapter(List<hospitalModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hospital_layout,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        hospitalModel hospitalModel=data.get(position);
        holder.hos_img.setImageResource(hospitalModel.getPhoto());
        holder.hos_name.setText(hospitalModel.getHospitalname());
    }

    @Override
    public int getItemCount() {
        if (data!=null)
            return data.size();
        return 0;
    }

    public class holder extends RecyclerView.ViewHolder {
        ImageView hos_img;
        TextView hos_name;
        public holder(@NonNull View itemView) {
            super(itemView);
            hos_img=itemView.findViewById(R.id.photo);
            hos_name=itemView.findViewById(R.id.hos_name);
        }
    }
}
