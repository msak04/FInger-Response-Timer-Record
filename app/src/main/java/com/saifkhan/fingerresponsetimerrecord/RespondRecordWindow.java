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

public class RespondRecordWindow extends AppCompatActivity implements View.OnClickListener {

    Button BStart,BFinish;
    int RandVar1,RandVar2;

    private Button [][] B = new Button[8][8];


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
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++)
            {
                String buttonID = "button_ball_rrw_"+i+j;
                int ResID = getResources().getIdentifier(buttonID,"id",getPackageName());
                B[i][j] = findViewById(ResID);
                B[i][j].setOnClickListener(this);
            }
        }
        BStart = findViewById(R.id.button_start_rrw);

        BFinish = findViewById(R.id.button_finish_rrw);
        RandVar1= 1 + (int)(Math.random() * 8);
        RandVar2= 1 + (int)(Math.random() * 8);

        BStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            B[RandVar1][RandVar2].setVisibility(View.VISIBLE);
            BStart.setVisibility(View.INVISIBLE);
            //Record Time
            previousTime = System.currentTimeMillis();
            }
        });

        for(int i=0;i<90;i++)
        {

            B[RandVar1][RandVar2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        B[RandVar1][RandVar2].setVisibility(View.INVISIBLE);
                        RandVar1= 1 + (int)(Math.random() * 8);
                        RandVar2= 1 + (int)(Math.random() * 8);
                        B[RandVar1][RandVar2].setVisibility(View.VISIBLE);
                        //Record Time
                        currentTime= System.currentTimeMillis();
                        timeDuretion= currentTime-previousTime;
                        timeList.add(timeDuretion);
                        previousTime = System.currentTimeMillis();
                }
            });

//            if(i==89){
//                B[m][n].setVisibility(View.INVISIBLE);
//                BFinish.setVisibility(View.VISIBLE);
//                //Record Time
//                currentTime= System.currentTimeMillis();
//                timeDuretion= currentTime-previousTime;
//                timeList.add(timeDuretion);
//            }
        }

        BFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

    @Override
    public void onClick(View v) {

    }
}