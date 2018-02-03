package com.dt.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Demo001_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo001);
    }

    public void choosePic(View view) {

        ImageButton image = findViewById(R.id.image);

        if (view.getId() == R.id.green) {
            image.setImageResource(R.drawable.green);
        } else if (view.getId() == R.id.tree) {
            image.setImageResource(R.drawable.tree);
        } else if (view.getId() == R.id.meinv) {
            image.setImageResource(R.drawable.meinv);
        } else if (view.getId() == R.id.view) {
            image.setImageResource(R.drawable.view );
        }
    }
}