package com.dt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int point = 0;
    private int num1 = 0;
    private int num2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickNumber();
    }

    public void pickNumber() {
        Button leftBtn = (Button) findViewById(R.id.leftButton);
        Button rightBtn = (Button) findViewById(R.id.rightButton);
        Random random = new Random();
        while(true){
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            if (num1 != num2) break;
        }

        System.out.println("num1: " + num1 + "num2: " + num2);

        leftBtn.setText(num1 + "");
        rightBtn.setText(num2 + "");
    }


    public void leftBtnClick(View view) {
        TextView tv_point = (TextView) findViewById(R.id.pointTextView);
        if (num1 > num2){
            point++;
            Toast.makeText(this,"回答正确+1分！",Toast.LENGTH_SHORT).show();
        } else{
            point--;
            Toast.makeText(this,"回答错误-1分！",Toast.LENGTH_SHORT).show();
        }
        pickNumber();
        tv_point.setText("您的得分：" + point);
    }

    public void rightBtnClick(View view) {
        TextView tv_point = (TextView) findViewById(R.id.pointTextView);
        if (num2 > num1){
            point++;
            Toast.makeText(this,"回答正确+1分！",Toast.LENGTH_SHORT).show();
        }else{
            point--;
            Toast.makeText(this,"回答错误-1分！",Toast.LENGTH_SHORT).show();
        }
        pickNumber();
        tv_point.setText("您的得分：" + point);
    }
}