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

    Button BStart,B11,B22,B33,B44,B55,B66,BFinish;
    String age=null, gender=null;
    List timeList = new ArrayList<String>();
    long previousTime, currentTime,timeDuretion;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DATA");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_record_window);

        //Property i have to store in final button
       /*
*/
        BStart = findViewById(R.id.button_start_rrw);
        B11 = findViewById(R.id.button_ball_11_rrw);
        B22 = findViewById(R.id.button_ball_22_rrw);
        B33 = findViewById(R.id.button_ball_33_rrw);
        B44 = findViewById(R.id.button_ball_44_rrw);
        B55 = findViewById(R.id.button_ball_55_rrw);
        B66 = findViewById(R.id.button_ball_66_rrw);
        BFinish = findViewById(R.id.button_finish_rrw);

        BStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            B11.setVisibility(View.VISIBLE);
            BStart.setVisibility(View.INVISIBLE);
            //Record Time
            previousTime = System.currentTimeMillis();
            }
        });

        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B22.setVisibility(View.VISIBLE);
                B11.setVisibility(View.INVISIBLE);

                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B33.setVisibility(View.VISIBLE);
                B22.setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B44.setVisibility(View.VISIBLE);
                B33.setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B55.setVisibility(View.VISIBLE);
                B44.setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();

            }
        });
        B55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B66.setVisibility(View.VISIBLE);
                B55.setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();

            }
        });
        B66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BFinish.setVisibility(View.VISIBLE);
                B66.setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        BFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                // Get age and gender from previous activity
                Bundle extras = getIntent().getExtras();

                if (extras != null) {
                    age = extras.getString("age");
                    gender = extras.getString("gender");
                }
                //creating an unique user id
                String userid = String.valueOf(System.currentTimeMillis());
                RespondData savedata = new RespondData(age,gender,timeList);
                DatabaseReference myRef = database.getReference("DATA");
                Toast.makeText(getApplicationContext(),"Age:"+age+"; Gender:"+gender, Toast.LENGTH_SHORT).show();
                myRef.child(userid).setValue(savedata);
                finish();
                System.exit(0);
            }
        });


    }
}