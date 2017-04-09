package com.example.werprojects.apptstrmk;

import com.firebase.client.Firebase;
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

    private String question;
    private int ans;
    private String ch1;
    private String ch2;
    private String ch3;
    private String ch4;
    private int slc;
    private Firebase m =
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
        gt();

        t=System.currentTimeMillis();
        mSwitcher=(TextSwitcher) findViewById(R.id.switcher);
        brk  = (Button) findViewById(R.id.RB);
        b1= (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);

        b1.setText(ch1);
        b2.setText(ch2);
        b3.setText(ch3);
        b4.setText(ch4);

        mSwitcher.setFactory(mFactory);
        mSwitcher.setCurrentText(question);

        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    slc=1;
                }
            }
        }));
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    slc=2;
                }
            }
        }));
        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    slc=3;
                }
            }
        }));
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(System.currentTimeMillis()<t+10000){
                    slc=4;
                }
            }
        }));
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                if(slc==ans){
                    mSwitcher.setCurrentText("Winner");
                }else{mSwitcher.setCurrentText("Fail");}
            }
        }.start();
    }
    private void gt(){
        Firebase.setAndroidContext(This);
        ans=1;
        ch1="A";
        ch2="b";
        ch3="c";
        ch4="d";
        question="A";
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
