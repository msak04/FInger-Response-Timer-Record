package com.saifkhan.fingerresponsetimerrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String age,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * Here I have to Save the Data in Shared Preferrence
        * Then I have to Take the time value in a array...
        * then Store The Data in Firebase...
        * */


    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male_main:
                if (checked)
                    gender = "M";
                break;
            case R.id.radio_female_main:
                if (checked)
                    gender = "F";
                break;
        }
    }
}