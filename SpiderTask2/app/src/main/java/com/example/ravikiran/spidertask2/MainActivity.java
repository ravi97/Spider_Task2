package com.example.ravikiran.spidertask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText roll;
    CheckBox webdev;
    CheckBox appdev;
    CheckBox tronix;
    CheckBox algo;
    private String nameOfApplicant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        name= (EditText) findViewById(R.id.editText);
        roll= (EditText) findViewById(R.id.editText2);
        webdev=(CheckBox) findViewById(R.id.checkBox);
        appdev=(CheckBox) findViewById(R.id.checkBox2);
        tronix=(CheckBox) findViewById(R.id.checkBox3);
        algo=(CheckBox) findViewById(R.id.checkBox4);


        if(name.getText().toString().matches("")){
            Toast.makeText(MainActivity.this, "You did not enter your name", Toast.LENGTH_SHORT).show();
        }
        else if(roll.getText().toString().matches("")){
            Toast.makeText(MainActivity.this, "You did not enter your roll number", Toast.LENGTH_SHORT).show();
        }
        else if((webdev.isChecked()==false)&&(appdev.isChecked()==false)&&(tronix.isChecked()==false)&&(algo.isChecked()==false) ){
            Toast.makeText(MainActivity.this, "You did not select any profile", Toast.LENGTH_SHORT).show();
        }
        else{
             Intent i=new Intent(this,MainActivity2.class);
             nameOfApplicant=name.getText().toString();
             i.putExtra("name",nameOfApplicant);
             startActivity(i);
        }

    }


}
