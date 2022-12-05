package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class adapFragHospital extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragmentsList=new ArrayList<>();
    ArrayList<String>titles=new ArrayList<>();
    public adapFragHospital(@NonNull FragmentManager fm) {
        super(fm);
    }


    public void addfragment(Fragment fragment ,String title){
        fragmentsList.add(fragment);
        titles.add(title);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position) ;

    }
}
