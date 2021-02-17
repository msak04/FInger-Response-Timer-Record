package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExitWindow extends AppCompatActivity {
    Button BExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_window);
        BExit = (Button) findViewById(R.id.Button_Proceed_TF);
        BExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });
    }
}