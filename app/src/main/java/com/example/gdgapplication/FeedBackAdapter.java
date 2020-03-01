package com.example.gdgapplication;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class FeedBackAdapter extends RecyclerView.Adapter <FeedBackAdapter.FeedBackViewHolder>{
    ArrayList<GDGFeedback> gdgFeedbacks;

    public FeedBackAdapter(ArrayList<GDGFeedback> gdgFeedbackxs, Context context) {
        this.gdgFeedbacks = gdgFeedbackxs;
        this.context = context;
        GDGFeedback gf= new GDGFeedback("Amaan","student",2,"graduate",20,"Good",true);
        gdgFeedbacks.add(gf);
    }

    Context context;

     class FeedBackViewHolder extends  RecyclerView.ViewHolder{
            TextView name , ocupation,qualification,rating;
         public FeedBackViewHolder(@NonNull View itemView) {
             super(itemView);
           name=itemView.findViewById(R.id.nameTV);
           //  ocupation=itemView.findViewById(R.id.occupationTV);
         //    qualification=itemView.findViewById(R.id.qualificationTV);
           //  rating=itemView.findViewById(R.id.ratingTV);
         }
     }

    @NonNull
    @Override
    public FeedBackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FeedBackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedBackViewHolder holder, int position) {
         GDGFeedback gdgFeedback=gdgFeedbacks.get(position);
        // holder.rating.setText(gdgFeedback.rating+"");
     //    holder.qualification.setText(gdgFeedback.qualification);
       //holder.name.setText((gdgFeedback.name + ", "+gdgFeedback.age).toString());
      //   holder.ocupation.setText(gdgFeedback.occupation);

    }

    @Override
    public int getItemCount() {
        return gdgFeedbacks.size();
    }
}
