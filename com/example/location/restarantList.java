package com.example.location;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.adapter.adapFragHospital;

public class restarantList extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restarant_list);
        viewPager=findViewById(R.id.view);
        adapFragHospital adapter=new adapFragHospital(getSupportFragmentManager());
        adapter.addfragment(new hospitalFragment(),"");
        viewPager.setAdapter(adapter);
    }
}