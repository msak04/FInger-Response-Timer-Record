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
import java.util.List;

public class RespondRecordThumbMedium extends AppCompatActivity implements View.OnClickListener {
    Button BStart;
    private Button [][] B = new Button[8][8];
    String age=null, gender=null, userid = null;
    List timeList = new ArrayList<String>();
    long previousTime, currentTime,timeDuretion;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DATA");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_record_thumb_medium);
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++)
            {
                String buttonID = "button_ball_RRTM_"+i+j;
                int ResID = getResources().getIdentifier(buttonID,"id",getPackageName());
                B[i][j] = findViewById(ResID);
                B[i][j].setOnClickListener(this);
            }
        }
        B[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[3][3].setVisibility(View.INVISIBLE);

                B[7][6].setVisibility(View.VISIBLE);
                //Record Time
                previousTime = System.currentTimeMillis();
            }
        });
        //31=====================================================================================================
        B[7][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[7][6].setVisibility(View.INVISIBLE);
                B[4][0].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();

            }
        });
        B[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[4][0].setVisibility(View.INVISIBLE);

                B[6][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[6][4].setVisibility(View.INVISIBLE);

                B[0][6].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][6].setVisibility(View.INVISIBLE);

                B[1][6].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[1][6].setVisibility(View.INVISIBLE);

                B[6][7].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[6][7].setVisibility(View.INVISIBLE);

                B[6][0].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[6][0].setVisibility(View.INVISIBLE);

                B[5][1].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[5][1].setVisibility(View.INVISIBLE);

                B[1][2].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[1][2].setVisibility(View.INVISIBLE);

                B[4][2].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[4][2].setVisibility(View.INVISIBLE);

                B[1][7].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        //41===============================================================================================================
        B[1][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[1][7].setVisibility(View.INVISIBLE);

                B[6][5].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[6][5].setVisibility(View.INVISIBLE);

                B[7][0].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[7][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[7][0].setVisibility(View.INVISIBLE);

                B[7][1].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[7][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[7][1].setVisibility(View.INVISIBLE);

                B[7][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[7][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[7][4].setVisibility(View.INVISIBLE);

                B[0][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][4].setVisibility(View.INVISIBLE);

                B[4][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });


        //1--------------------------------------------------------------------------------------------------------------------------------------------
        B[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[4][4].setVisibility(View.INVISIBLE);

                B[6][6].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[6][6].setVisibility(View.INVISIBLE);

                B[3][0].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[3][0].setVisibility(View.INVISIBLE);

                B[0][5].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][5].setVisibility(View.INVISIBLE);

                B[1][0].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[1][0].setVisibility(View.INVISIBLE);

                B[5][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[5][4].setVisibility(View.INVISIBLE);

                B[0][7].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][7].setVisibility(View.INVISIBLE);

                B[2][7].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[2][7].setVisibility(View.INVISIBLE);

                B[1][4].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[1][4].setVisibility(View.INVISIBLE);

                B[0][1].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][1].setVisibility(View.INVISIBLE);

                B[7][2].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        //11========================================================================================
        B[7][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[7][2].setVisibility(View.INVISIBLE);

                B[5][5].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[5][5].setVisibility(View.INVISIBLE);

                B[2][2].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });B[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[2][2].setVisibility(View.INVISIBLE);

                B[0][3].setVisibility(View.VISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);
                previousTime = System.currentTimeMillis();
            }
        });
        B[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                B[0][3].setVisibility(View.INVISIBLE);
                //Record Time
                currentTime= System.currentTimeMillis();
                timeDuretion= currentTime-previousTime;
                timeList.add(timeDuretion);

                // Get age and gender from previous activity
                Bundle extras = getIntent().getExtras();

                if (extras != null) {
                    age = extras.getString("age");
                    gender = extras.getString("gender");
                    userid = extras.getString("id");
                }
                //creating an unique user id
                RespondData savedata = new RespondData(age,gender,timeList);
                DatabaseReference myRef = database.getReference("DATA");
                Toast.makeText(getApplicationContext(),"Age:"+age+"; Gender:"+gender, Toast.LENGTH_SHORT).show();
                myRef.child(userid).child("ThumbFinger").child("M").setValue(savedata);
                Intent intent = new Intent(RespondRecordThumbMedium.this, RespondRecordThumbLarge.class);
                intent.putExtra("age",age);
                intent.putExtra("gender",gender);
                intent.putExtra("id",userid);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onClick(View v) {

    }
}