package com.example.tutorialapppart3;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imageView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.tutorialapppart3.ITEM_INDEX",-1);// get extra information of the activity which index to display -1 because it expexts default value

    }

    // set the image I want
    private int getImg(int index){ //private methode
        switch(index){
            case 0: return R.drawable.bestApple; // index 0
            case 1: return R.drawable.apple; // index 1
            case 2: return R.drawable.tomatoe; // index 2
            default: return -1;
        }
    }

    private void scaleImg(ImageView img, int pic){ //imageview that will be scaled
        Display screen = getWindowManager().getDefaultDisplay(); // I need to know how large is the screen I have
        BitmapFactory.Options options = new BitmapFactory.Options();// give acces to java library that scales images

        options.inJustDecodeBounds = true;  // I need to know about boundaries
        BitmapFactory.decodeResource(getResources(), pic, options); // help that app will not crash

        int imgWith = options.outWidth;
        int screenWidth = screen.getWidth();



    }


}