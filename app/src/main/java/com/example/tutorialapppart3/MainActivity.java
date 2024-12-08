package com.example.tutorialapppart3;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView myListView; //class
    String[] items; // string array with items


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        Resources res = getResources(); // creation of res variable
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items); // look for array called items

        //myListView.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));// adapter to merge these two files, String - 3 params (this list, what layout file I want to use, array to manage)

    }
}