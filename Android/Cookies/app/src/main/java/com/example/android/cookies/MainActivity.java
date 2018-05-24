package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eat(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.image);
        img.setImageResource(R.drawable.after_cookie);
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("I'm so full");
    }
}
