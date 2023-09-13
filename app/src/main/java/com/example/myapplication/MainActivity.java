package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnsubmit);
        TextView textView = findViewById(R.id.result);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 float height = Float.parseFloat(String.valueOf(editTextHeight.getText()));
                 float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                 float bmi= weight/(height*height);
                 textView.setText(String.valueOf(bmi));
             }
         });
    }
}
