package com.example.home.homenutritionist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ContactUsActivity extends AppCompatActivity {

    private Button Submitpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        Submitpress = (Button) findViewById(R.id.submitla);

        Submitpress.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(ContactUsActivity.this,"Thank you for submitting:D", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(ContactUsActivity.this, HomeActivity.class));
            }
        });

    }
}