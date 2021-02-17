package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexFinger extends AppCompatActivity {
    Button BProceed;
    String age=null, gender=null, id=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_finger);
        BProceed = (Button) findViewById(R.id.Button_Proceed_IF);
        BProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Shared Preferrence have to put them in a button
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    age = extras.getString("age");
                    gender = extras.getString("gender");
                    id = extras.getString("id");
                }
                Intent intent = new Intent(IndexFinger.this, RespondRecordIndexSmall.class);
                intent.putExtra("age",age);
                intent.putExtra("gender",gender);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}