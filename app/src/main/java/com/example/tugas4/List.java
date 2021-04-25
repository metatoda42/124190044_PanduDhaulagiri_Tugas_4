package com.example.tugas4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class List extends Fragment  {
    RecyclerView recyclerView;
    String[] judul;
    String[] deskripsi;
    int[] images ={
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a91
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerviewid);
        judul=getResources().getStringArray(R.array.judul);
        deskripsi=getResources().getStringArray(R.array.deskripsi);

        RV_Adapter rv_adapter = new RV_Adapter(this.getContext(), judul, deskripsi, images);
        recyclerView.setAdapter(rv_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }

}