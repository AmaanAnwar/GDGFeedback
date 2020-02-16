package com.example.gdgapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class ThankyouActivity extends AppCompatActivity {
    TextView thankyouTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);

        thankyouTV = (TextView)findViewById(R.id.thankyouTV) ;
        String name = getIntent().getStringExtra("name");
        thankyouTV.setText(thankyouTV.getText()+ ""+ name);


    }

}
