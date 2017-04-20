package com.example.home.homenutritionist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity {

    Button healthybeginner;
    Button healthyweekend;
    Button bellykiller;
    Button economydelight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        healthybeginner = (Button) findViewById(R.id.button2);

        healthybeginner.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuInfo1Activity.class));
            }
        });
    }


}
