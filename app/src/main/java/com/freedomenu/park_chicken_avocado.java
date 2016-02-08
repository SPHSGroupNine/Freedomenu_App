package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.freedomenu.R;


public class park_chicken_avocado extends Activity {


    private static Button button;
    private static Button button2;
    private static Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.park_chicken_avocado);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_park_chicken_avocado_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.turkey_avocado");
                        startActivity(intent);
                    }

                }

        );
    }    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_park_chicken_avocado_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.the_plants");
                        startActivity(intent);
                    }

                }

        );
    }
    public void OnClickButtonListener3() {
    button3 = (Button) findViewById(R.id.button_park_chicken_avocado_center);
    button3.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent("com.freedomenu.activity_park_chicken_avocado");
                    startActivity(intent);
                }

            }

    );
}
}
