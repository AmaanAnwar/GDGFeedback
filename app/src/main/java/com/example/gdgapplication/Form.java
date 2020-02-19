package com.example.gdgapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

public class Form extends AppCompatActivity {
    Button submitBtn;
    EditText nameEdt;
    RatingBar ratingBar;
    Spinner qualification;
    RadioButton studentRB,profRB;
    EditText suggesyionET;
    SeekBar ageSB;
    CheckBox agreeSB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
      /*  nameEdt = (EditText) findViewById(R.id.nameedt);
        submitBtn = (Button)findViewById(R.id.submitbtn);
        submitBtn.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View view){

                                             Intent i = new Intent(Form.this,ThankyouActivity.class);
                                             i.putExtra("name",nameEdt.getText().toString());
                                             startActivity(i);
                                         }
                                     }
        );


        ratingBar = findViewById(R.id.rb);
        qualification =findViewById(R.id.qualificationspn);
        studentRB =findViewById(R.id.studentRB);
        profRB=findViewById(R.id.profRB);
        suggesyionET =findViewById(R.id.suggest);
        ageSB=findViewById(R.id.seekbar);
        agreeSB =findViewById(R.id.consentCB);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= nameEdt.getText().toString();
                String suggestion=suggesyionET.getText().toString();
                String qualificat = qualification.getSelectedItem().toString();
                String occupation = "Not Selected";
                if(studentRB.isChecked()){
                    occupation="Student";
                }
                if(profRB.isChecked()){
                    occupation="Professional";
                }
                int age = ageSB.getProgress();
                boolean isAgree = agreeSB.isChecked();
                int rating=ratingBar.getProgress();
                GDGFeedback gdgFeedback= new GDGFeedback(name,occupation,rating,qualificat,age,suggestion,isAgree);
                Intent intent =new Intent(Form.this,ThankyouActivity.class);
                intent.putExtra("name",nameEdt.getText().toString());
                intent.putExtra("feedback",gdgFeedback);
                startActivity(intent);
            }
        });*/
    }
}
