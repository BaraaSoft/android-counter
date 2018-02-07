package com.baraa.bsoft.sabehapp;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter;
    TextView textView;
    Vibrator vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvCounter);
        vibrate = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void incrementCounter(View view){
        counter = counter +1;
        display(counter);
    }

    public void resetCounter(View view){
        counter = 0;
        display(counter);
    }

    public void display(int count){
        vibrate.cancel();
        textView.setText(""+count);

        vibrate.vibrate(50);
    }

}
