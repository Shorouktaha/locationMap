package com.example.location;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import com.example.adapter.adapFragHospital;
import com.example.adapter.hospitalAdapter;
import com.example.model.hospitalModel;

import java.util.ArrayList;

public class hospitalList extends AppCompatActivity {
   ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);
        viewPager=findViewById(R.id.view);
       // searchView=findViewById(R.id.search);
        adapFragHospital adapter=new adapFragHospital(getSupportFragmentManager());
        adapter.addfragment(new hospitalFragment(),"");
        viewPager.setAdapter(adapter);
    }
    }