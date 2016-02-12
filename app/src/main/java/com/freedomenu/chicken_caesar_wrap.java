package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class chicken_caesar_wrap extends Activity {

    private static Button button;
    private static Button button2;
    private static Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_caesar_wrap);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_chicken_caesar_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.tuna_salad");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_chicken_caesar_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.severn_club");
                        startActivity(intent);
                    }

                }

        );
    }
    public void OnClickButtonListener3() {
        button3 = (Button) findViewById(R.id.button_chicken_caesar_center);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.ChickenCaesarWrapSandwich");
                        startActivity(intent);
                    }

                }

        );
    }
}
