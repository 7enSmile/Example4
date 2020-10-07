package com.example.examples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentThree extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentOne f1=new FragmentOne();
        FragmentSecond f2=new FragmentSecond();
       getFragmentManager().beginTransaction().replace(R.id.fragSecond2,f2).commit();
       getFragmentManager().beginTransaction().replace(R.id.fragOne2,f1).commit();






        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}