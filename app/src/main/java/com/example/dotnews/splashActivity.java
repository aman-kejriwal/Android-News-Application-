package com.example.dotnews;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "Loading From Server......", Toast.LENGTH_LONG).show();
        Thread td=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent =new Intent(splashActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };td.start();
    }
}
