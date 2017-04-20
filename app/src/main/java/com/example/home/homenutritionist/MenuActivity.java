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
        healthyweekend = (Button) findViewById(R.id.button3);
        bellykiller = (Button) findViewById(R.id.button4);
        economydelight = (Button) findViewById(R.id.button5);

        healthybeginner.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuInfo1Activity.class));
            }
        });
        healthyweekend.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuInfo2Activity.class));
            }
        });
        bellykiller.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuInfo3Activity.class));
            }
        });
        economydelight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MenuInfo4Activity.class));
            }
        });
    }


}
