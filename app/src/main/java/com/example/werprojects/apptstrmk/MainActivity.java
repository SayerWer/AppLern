package com.example.werprojects.apptstrmk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        Button b = (Button) findViewById(R.id.bttn);
        b.setOnClickListener((new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, TstAct.class));
                    }
                })


        );
    }
}
