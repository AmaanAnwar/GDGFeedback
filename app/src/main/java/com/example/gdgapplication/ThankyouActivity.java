package com.example.gdgapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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
        feedBackAdapter = new FeedBackAdapter(gFlist,this);
        feedbackrecv=findViewById(R.id.recylerview);
        feedbackrecv.setAdapter(feedBackAdapter);
        thankyouTV.setText(thankyouTV.getText()+ " "+ name);

    }


}
