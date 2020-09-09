package com.example.quranproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class QuranCenter_Reg extends AppCompatActivity {
EditText et_centerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_center__reg);
        et_centerName=findViewById(R.id.QuranCenter_et_CenterName);
        EditText_EditFont(et_centerName,"Hacen_Tunisia.ttf");

    }

    public void TextView_EditFont(TextView textView,String path){
        textView.setTypeface(Typeface.createFromAsset(getAssets(),path));
    }
    public void EditText_EditFont(EditText editText,String path){
        editText.setTypeface(Typeface.createFromAsset(getAssets(),path));
    }

}
