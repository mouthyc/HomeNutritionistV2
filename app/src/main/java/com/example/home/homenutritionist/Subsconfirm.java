package com.example.home.homenutritionist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Subsconfirm extends AppCompatActivity {
    private Button Confirmback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subscribeconfirm);


        Confirmback = (Button) findViewById(R.id.confirmbtn);

        Confirmback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Subsconfirm.this, "Thank you for the subs! Our consultant will contact you soon.", Toast.LENGTH_LONG).show();

                startActivity(new Intent(Subsconfirm.this, HomeActivity.class));
            }
        });
    }
}