package com.example.tugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.RV_Holder> {
    String[] data1;
    String[] data2;
    int[] images;
    Context context;
    public RV_Adapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public RV_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.rv_row, parent, false);
        return new RV_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RV_Holder holder, int position) {
        holder.rvjudul.setText(data1[position]);
        holder.rvdeskripsi.setText(data2[position]);
        holder.rvimage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class RV_Holder extends RecyclerView.ViewHolder{


        TextView rvjudul;
        TextView rvdeskripsi;
        ImageView rvimage;


        public RV_Holder(@NonNull View itemView) {
            super(itemView);
            rvjudul = itemView.findViewById(R.id.rowjudul);
            rvdeskripsi = itemView.findViewById(R.id.rowdeskripsi);
            rvimage = itemView.findViewById(R.id.rowimage);
        }
    }
}
