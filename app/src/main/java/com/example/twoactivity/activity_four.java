package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class activity_four extends AppCompatActivity  implements View.OnClickListener {

    Button btnActOne;
    Button btnActTwo;
    Button btnActThree;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        Log.d(TAG, "activity_four: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnActTwo:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                startActivity(intent2);
                break;
            case R.id.btnActThree:
                Intent intent3 = new Intent(this, activity_three.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "activity_four: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "activity_four: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "activity_four: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "activity_four: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "activity_four: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "activity_four: onRestart()");
    }}

