package com.dt.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class Dictionary extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionaries);
    }

    public void lookUp(View view) {
        EditText wordText = findViewById(R.id.wordEditText);
        TextView dectionary = findViewById(R.id.lookUpTextView);
        String findWord = wordText.getText().toString();
        //查找到的单词内容
        String def = ReadDectionary(findWord);
        if (def == null) {
            dectionary.setText("The word is not found.");
        } else {
            dectionary.setText(def);
        }
    }

    private String ReadDectionary(String findWord) {
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.gre));

        while(scan.hasNext()) {
            String line = scan.nextLine();
            String[] pieces = line.split("\t");
            // pieces = {"DT","dingtao"}
            if (pieces[0].equalsIgnoreCase(findWord)) {
                return pieces[1];
            }
        }
        return null;
    }
}