package com.example.gdgapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ThankyouActivity extends AppCompatActivity {
    TextView thankyouTV;
    ArrayList <GDGFeedback>gFlist;
    FeedBackAdapter feedBackAdapter;
    RecyclerView feedbackrecv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        GDGFeedback gdgFeedback= (GDGFeedback) getIntent().getSerializableExtra("feedback");
        thankyouTV = (TextView)findViewById(R.id.thankyouTV) ;
        String name = getIntent().getStringExtra("name");
        gFlist = new ArrayList<GDGFeedback>();
        gFlist.add(gdgFeedback);
       GDGFeedback gf= new GDGFeedback("Amaan","student",2,"graduate",20,"Good",true);
        gFlist.add(gf);
        GDGFeedback gf2= new GDGFeedback("Amaan","student",2,"graduate",20,"Good",true);
        gFlist.add(gf2);
        feedBackAdapter = new FeedBackAdapter(gFlist,this);
        feedbackrecv=findViewById(R.id.recylerview);
        feedbackrecv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        feedbackrecv.setAdapter(feedBackAdapter);
        feedBackAdapter.notifyDataSetChanged();
        thankyouTV.setText(thankyouTV.getText()+ " "+ name);

    }


}
