package com.example.lbkomunitas;  

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;  
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {


    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
    }  
  
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /* Inflate the layout for this fragment*/
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        return view;
    }



 }