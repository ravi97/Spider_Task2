package com.example.ravikiran.spidertask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    private String name;
    private String toBeDisplayed;
    private String datetime;
    TextView display;
    TextView timestamp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();
        name=i.getStringExtra("name");
        toBeDisplayed="Thank you "+name+" for your response!";
        display=(TextView)findViewById(R.id.textView3);
        display.setText(toBeDisplayed);


        datetime=java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
        timestamp=(TextView)findViewById(R.id.textView4);
        timestamp.setText(datetime);

    }
    public void goBack(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
