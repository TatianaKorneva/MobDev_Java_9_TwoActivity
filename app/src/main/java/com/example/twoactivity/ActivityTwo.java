package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity  implements View.OnClickListener {

    Button btnActOne;
    Button btnActThree;
    Button btnActFour;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);
        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);

        Log.d(TAG, "ActivityTwo: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intent2 = new Intent(this, activity_three.class);
                startActivity(intent2);
                break;
            case R.id.btnActFour:
                Intent intent3 = new Intent(this, activity_four.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityTwo: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityTwo: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityTwo: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityTwo: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityTwo: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityTwo: onRestart()");
    }}
