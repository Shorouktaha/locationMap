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
import com.example.adapter.restaruntAdapter;
import com.example.model.hospitalModel;

import java.util.ArrayList;


public class resturantFragment extends Fragment {
    RecyclerView rec;
    restaruntAdapter resturantAdapter;
    ArrayList<hospitalModel> resData=new ArrayList<hospitalModel>();
    public resturantFragment() {
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
        return inflater.inflate(R.layout.fragment_resturant, container, false);
    }
    private void addFakeData() {
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
        resData.add(new hospitalModel("fatma",R.drawable.panda));
    }
    private void setRecycl(View view){

        addFakeData();
        // hospitalAdapter =new hospitalAdapter(chatData ,this::onchatClick);
        resturantAdapter =new restaruntAdapter(resData);
        rec.setAdapter(resturantAdapter);
        rec.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}