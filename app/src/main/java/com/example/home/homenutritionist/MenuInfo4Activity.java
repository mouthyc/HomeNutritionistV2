package com.example.home.homenutritionist;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuInfo4Activity extends AppCompatActivity {

    Button subscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuinfo4);

        subscribe = (Button) findViewById(R.id.subscribe1);

        subscribe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuInfo4Activity.this, Subsconfirm.class));
            }
        });

    }
}
