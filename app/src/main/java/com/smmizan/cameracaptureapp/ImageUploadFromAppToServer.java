package com.smmizan.cameracaptureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ImageUploadFromAppToServer extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    EditText editText;
    Button bImageSelect,bImageUpload;
    Bitmap bitmap;
    private static final int IMG_REQ = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_upload_from_app_to_server);

        imageView = findViewById(R.id.upload_image);
        editText = findViewById(R.id.image_title);
        bImageSelect = findViewById(R.id.b_image_choice);
        bImageUpload = findViewById(R.id.b_image_Upload);
        bImageSelect.setOnClickListener(this);
        bImageUpload.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.b_image_choice:



                
                break;
            case R.id.b_image_Upload:
                break;

        }

    }
}