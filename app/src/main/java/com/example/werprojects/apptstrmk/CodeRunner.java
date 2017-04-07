package com.example.werprojects.apptstrmk;

import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;

/**
 * Created by sawye on 4/6/2017.
 */
public class CodeRunner implements Runnable {
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button brk;
    TextSwitcher tv;
    public boolean h=false;
    long tt;
    @Override
    public void run() {
        tt=System.currentTimeMillis();
        //thread.sleep(10);
        while(tt>System.currentTimeMillis()-1000){

            brk.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            return;
                        }
                    })

            );

            b1.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );

            b2.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );

            b3.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );

            b4.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            h=true;
                        }
                    })
            );
           // if(!h&&System.currentTimeMillis()>tt+1000)
              //  tv.setCurrentText("You Failed");
        }

    }
    public CodeRunner(Button a, Button b, Button c, Button d, Button e, TextSwitcher ff, long t){
        brk=a;
        b1=b;
        b2=c;
        b3=d;
        b4=e;
        tv=ff;
        tt=t;
    }
    public boolean getVal(){
        return h;
    }
}
