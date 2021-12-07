package com.example.learningtime;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private static int SPlASH_SCREEN=3000;
    private int i=0;
    private Timer timer;
    private ProgressBar pb;
    ImageView IV;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        IV=findViewById(R.id.IV);
        pb=(ProgressBar)findViewById(R.id.progressBar);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(i<100){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                    pb.setProgress(i);
                    i++;
                }
                else
                {
                    timer.cancel();
                    Intent intent= new Intent(MainActivity.this,first.class);
                    startActivity(intent);
                    finish();
                }
            }
        },0,20);
    }
}