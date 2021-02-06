package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class RespondRecordWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_record_window);
        Intent intent=getIntent();
        final String age=intent.getStringExtra("ageKey");
        final String gender=intent.getStringExtra("genderKey");




    }
}