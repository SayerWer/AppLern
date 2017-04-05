package com.example.werprojects.apptstrmk;

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
    private Long t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tst);

        mSwitcher = (TextSwitcher) findViewById(R.id.switcher);
        mSwitcher.setFactory(mFactory);
        //mSwitcher.setCurrentText(String.valueOf(mCounter));
        mSwitcher.setCurrentText("Test");
        Button br = (Button) findViewById(R.id.RB);
        br.setOnClickListener((new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        t= System.currentTimeMillis();
                    }
                })


        );
    }
    private boolean h=false;
    public void qA(){

        while(System.currentTimeMillis()<t+1000){
            Button br = (Button) findViewById(R.id.RB);
            br.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                           return;
                        }
                    })

            );
            Button b1 = (Button) findViewById(R.id.b1);
            br.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );
            Button b2 = (Button) findViewById(R.id.b2);
            br.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );
            Button b3 = (Button) findViewById(R.id.b3);
            br.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );
            Button b4 = (Button) findViewById(R.id.b4);
            br.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );


        }

        if(!h)
        mSwitcher.setCurrentText("You Failed");
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
