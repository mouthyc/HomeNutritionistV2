package com.example.home.homenutritionist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ContactUsActivity extends AppCompatActivity {

    private Button Submitpress;
    private Button Callus;
    Uri number=Uri.parse("tel:81777778");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        Submitpress = (Button) findViewById(R.id.submitla);

        Callus = (Button) findViewById(R.id.callusla);
        Callus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent dial = new Intent(Intent.ACTION_DIAL, number);
                startActivity(dial);

                Submitpress.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(ContactUsActivity.this, "Thank you for submitting:D", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(ContactUsActivity.this, HomeActivity.class));
                    }
                })
            ;}
        })
    ;}
}