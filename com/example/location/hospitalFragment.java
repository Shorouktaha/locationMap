package com.example.location;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adapter.hospitalAdapter;
import com.example.model.hospitalModel;

import java.util.ArrayList;

public class hospitalFragment extends Fragment {
    RecyclerView rec;
    hospitalAdapter hospitalAdapter;
    ArrayList<hospitalModel> hosData=new ArrayList<hospitalModel>();

    public hospitalFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rec=view.findViewById(R.id.rec_hosp);
        setRecycl(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hospital, container, false);
    }
    private void addFakeData() {
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
        hosData.add(new hospitalModel("fatma",R.drawable.panda));
    }
    private void setRecycl(View view){

        addFakeData();
        // hospitalAdapter =new hospitalAdapter(chatData ,this::onchatClick);
        hospitalAdapter =new hospitalAdapter(hosData);
        rec.setAdapter(hospitalAdapter);
        rec.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}