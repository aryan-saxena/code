package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView item1 = (TextView)findViewById(R.id.menu_item_1);
        String i1= item1.getText().toString();
        Log.v("MainActivity.java",i1);
        TextView item2 = (TextView)findViewById(R.id.menu_item_2);
        String i2= item2.getText().toString();
        Log.v("MainActivity.java",i2);
        TextView item3 = (TextView)findViewById(R.id.menu_item_3);
        String i3= item3.getText().toString();
        Log.v("MainActivity.java",i3);
    }
}