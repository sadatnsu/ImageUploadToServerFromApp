package com.smmizan.cameracaptureapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;

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

                selectImagesFromGellary();

                break;
            case R.id.b_image_Upload:
                break;

        }

    }

    private void selectImagesFromGellary()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,IMG_REQ);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == IMG_REQ && resultCode == RESULT_OK && data!=null)
        {
            Uri uri = data.getData();

            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
                bImageSelect.setEnabled(false);
                bImageUpload.setEnabled(true);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}