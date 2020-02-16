package com.example.gdgapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class FeedBackAdapter extends RecyclerView.Adapter {
    ArrayList<GDGFeedback> gdgFeedbacks ;

    public FeedBackAdapter(ArrayList<GDGFeedback> gdgFeedbacks, Context context) {
        this.gdgFeedbacks = gdgFeedbacks;
        this.context = context;
    }

    Context context;

     class FeedBackViewHolder extends  RecyclerView.ViewHolder{
            TextView name , ocupation,qualification,rating;
         public FeedBackViewHolder(@NonNull View itemView) {
             super(itemView);
             name=itemView.findViewById(R.id.nameTV);
             ocupation=itemView.findViewById(R.id.occupationTV);
             qualification=itemView.findViewById(R.id.qualificationTV);
             rating=itemView.findViewById(R.id.ratingTV);
         }
     }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
