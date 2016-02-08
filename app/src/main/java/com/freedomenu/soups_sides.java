package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class soups_sides extends Activity {

    private static Button button;
    private static Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soups_sides);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_soups_sides_right);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.Hot_Paninis");
                        startActivity(intent);
                    }

                }
        );
    }

    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_soups_sides_left);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.MainActivity2");
                        startActivity(intent);
                    }


                }
        );
    }

    public void OnClickButtonListener3() {
        button2 = (Button) findViewById(R.id.button_soups_sides_center);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.SoupsAndSides");
                        startActivity(intent);
                    }


                }
        );
    }


}

