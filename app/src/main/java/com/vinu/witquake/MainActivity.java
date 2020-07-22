package com.vinu.witquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    Animation logo_anim,tagline1_anim,tagline2_anim;
    TextView tagline1,tagline2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.imageView_logo);
        tagline1 = findViewById(R.id.tagline_main1);
        tagline2 = findViewById(R.id.tagline_main2);
        logo_anim = AnimationUtils.loadAnimation(this,R.anim.fade);
        tagline1_anim = AnimationUtils.loadAnimation(this,R.anim.fade);
        tagline2_anim = AnimationUtils.loadAnimation(this,R.anim.wave);
        logo.setAnimation(logo_anim);
        tagline1.setAnimation(tagline1_anim);
        tagline2.setAnimation(tagline2_anim);
    }
}