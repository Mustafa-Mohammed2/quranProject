package com.example.quranproject;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Log_in_Center extends AppCompatActivity {

    Button btn ;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in__center);

        btn=findViewById(R.id.log_center_btn_log);
        toolbar=findViewById(R.id.log_center_tool);
    }
}