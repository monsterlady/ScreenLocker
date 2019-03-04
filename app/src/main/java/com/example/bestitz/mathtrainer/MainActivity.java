package com.example.bestitz.mathtrainer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView passwordscreen;
    ArrayList<Integer> inputPassword;
    String hardcode = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passwordscreen = findViewById(R.id.PASSWORD);
        inputPassword = new ArrayList<Integer>();
    }



    public String stars(){
        String str = "";
        if(inputPassword.size() > 0){
            for(int i = 0;i<inputPassword.size();i++){
                str += "*";
            }
        }
        return str;
    }

    public void clickNum1(View view) {
        inputPassword.add(1);
        passwordscreen.setText(stars());
    }

    public void clickNum2(View view) {
        inputPassword.add(2);
        passwordscreen.setText(stars());
    }

    public void clickNum3(View view) {
        inputPassword.add(3);
        passwordscreen.setText(stars());
    }

    public void clickNum4(View view) {
        inputPassword.add(4);
        passwordscreen.setText(stars());
    }

    public void clickNum7(View view) {
        inputPassword.add(7);
        passwordscreen.setText(stars());
    }

    public void clickNum5(View view) {
        inputPassword.add(5);
        passwordscreen.setText(stars());
    }

    public void clickNum8(View view) {
        inputPassword.add(8);
        passwordscreen.setText(stars());
    }

    public void clickNum0(View view) {
        inputPassword.add(0);
        passwordscreen.setText(stars());
    }

    public void clickNum6(View view) {
        inputPassword.add(6);
        passwordscreen.setText(stars());
    }

    public void clickNum9(View view) {
        inputPassword.add(9);
        passwordscreen.setText(stars());
    }

    public void clickCancle(View view) {
        passwordscreen.setBackgroundColor(Color.WHITE);
        if(inputPassword.size() > 0) {
            inputPassword.remove(inputPassword.size() - 1);
            passwordscreen.setText(stars());
        }
    }

    public void checkanswer(View view) {
        if(inputPassword.size() > 0){
            String str = "";
            for(Integer each : inputPassword){
                str += Integer.toString(each);
            }
            if(str.equals(hardcode)){
                //TODO Jump to another page
                passwordscreen.setBackgroundColor(Color.GREEN);
                Intent intent = new Intent(MainActivity.this,SecondPage.class);
                startActivity(intent);
            } else {
                passwordscreen.setBackgroundColor(Color.RED);
            }
        }
    }


}
