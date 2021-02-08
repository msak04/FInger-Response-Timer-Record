package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RespondRecordWindow extends AppCompatActivity {

    Button B11,B12,B13,B14,B15,B16;
    Button B21,B22,B23,B24,B25,B26;
    Button B31,B32,B33,B34,B35,B36;
    Button B41,B42,B43,B44,B45,B46;
    Button B51,B52,B53,B54,B55,B56;
    Button B61,B62,B63,B64,B65,B66;
    String age=null, gender=null;
    Double timearray [] = new Double[0];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_record_window);

        B11 = findViewById(R.id.button_ball_11_rrw);

        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RespondData savedata = new RespondData(age,gender,timearray);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    age = extras.getString("age");
                    gender = extras.getString("gender");
                }
                DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("DATA");
                mDatabase.setValue(savedata);

            }
        });



    }
}