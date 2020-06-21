package com.smmizan.cameracaptureapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bNormal,bHigh,bSendImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bNormal = findViewById(R.id.bCaptureNormal);
        bNormal = findViewById(R.id.bCaptureHigh);
        bNormal = findViewById(R.id.bSendImageToServer);


    }

}