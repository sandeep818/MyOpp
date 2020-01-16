package com.jungle.myopp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Man man=new Man("male","sandeep",25);
        Log.i("man", "onCreate: "+man.getGender());
    }
}
