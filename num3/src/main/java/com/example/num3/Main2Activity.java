package com.example.num3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne;
    TextView tw2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnOne = (Button) findViewById(R.id.ActOne);
        btnOne.setOnClickListener(this);
        tw2=(TextView) findViewById(R.id.tw2);
        Bundle arguments = getIntent().getExtras();
        String name=arguments.get("name").toString();
        tw2.setText(name);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ActOne:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}
