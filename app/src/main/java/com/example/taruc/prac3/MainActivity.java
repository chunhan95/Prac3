package com.example.taruc.prac3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTARUC(View view){
        String uri= "http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    public void showMain(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showDial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "0123456789"));
        startActivity(intent);
    }

    public void showSend(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:" + "lee_chnhn@hotmail.com"));
        startActivity(intent);
    }
}
