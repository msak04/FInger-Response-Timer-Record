package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RespondRecordWindow extends AppCompatActivity {

    Button B11,B12,B13,B14,B15,B16;
    String age=null, gender=null;
    String[] timearray= {"John","Tim","Sam","Ben"};
    List nameList = new ArrayList<String>(Arrays.asList(timearray));

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DATA");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_record_window);

        B11 = findViewById(R.id.button_ball_11_rrw);

        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    age = extras.getString("age");
                    gender = extras.getString("gender");

                }
                String userid = String.valueOf(System.currentTimeMillis());
                RespondData savedata = new RespondData(age,gender,nameList);//
                DatabaseReference myRef = database.getReference("DATA");
                Toast.makeText(getApplicationContext(),"Age:"+age+"; Gender:"+gender, Toast.LENGTH_SHORT).show();
                myRef.child(gender).child(age).child(userid).setValue(savedata);

            }
        });



    }
}