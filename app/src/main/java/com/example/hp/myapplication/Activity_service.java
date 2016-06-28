package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_service extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_service);
    }

    public void StartMethod(View G){
        Intent i=new Intent(Activity_service.this,MyService.class);
        startService(i);


    }

    public void StopMethod(View V){
        Intent j=new Intent(Activity_service.this,MyService.class);
        stopService(j);


    }
}
