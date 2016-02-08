package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class chopped_salad extends Activity {


    private static Button button;
    private static Button button2;
    private static Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chopped_salad);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_chopped_salad_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.park_salad");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_chopped_salad_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.greek_salad");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button3 = (Button) findViewById(R.id.button_chopped_salad_center);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.activity_the_cuban");
                        startActivity(intent);
                    }

                }

        );
    }
}