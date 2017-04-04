package com.example.werprojects.apptstrmk;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tst);

        mSwitcher = (TextSwitcher) findViewById(R.id.switcher);
        mSwitcher.setFactory(mFactory);
        //mSwitcher.setCurrentText(String.valueOf(mCounter));
        mSwitcher.setCurrentText("Test");

    }

    public void qA(){


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
