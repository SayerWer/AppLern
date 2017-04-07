package com.example.werprojects.apptstrmk;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class TstAct extends AppCompatActivity {



    private TextSwitcher mSwitcher;
    private Button brk;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private long t;
    private boolean cc=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tst);

        t=System.currentTimeMillis();
        mSwitcher=(TextSwitcher) findViewById(R.id.switcher);
        brk  = (Button) findViewById(R.id.RB);
        b1= (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);
        mSwitcher.setFactory(mFactory);
        mSwitcher.setCurrentText("Test");

        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    cc=true;
                }
            }
        }));
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    cc=true;
                }
            }
        }));
        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    cc=true;
                }
            }
        }));
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    cc=true;
                }
            }
        }));
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                if(cc){
                    mSwitcher.setCurrentText("Winner");
                }else{mSwitcher.setCurrentText("Fail");}
            }
        }.start();
    }

    private ViewSwitcher.ViewFactory mFactory = new ViewSwitcher.ViewFactory() {

        @Override
        public View makeView() {

            // Create a new TextView
            TextView t = new TextView(TstAct.this);
            t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(TstAct.this, android.R.style.TextAppearance_Large);
            return t;
        }
    };
}
