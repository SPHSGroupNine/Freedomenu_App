package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.freedomenu.R;


public class cobb_salad extends Activity {


    private static Button button;
    private static Button button2;
    private static Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cobb_salad);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_cobb_salad_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.chef_salad");
                        startActivity(intent);
                    }

                }

        );
    }    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_cobb_salad_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.spinach_chicken_salad");
                        startActivity(intent);
                    }

                }

        );
    }
   public void OnClickButtonListener3() {
    button3 = (Button) findViewById(R.id.button_cobb_salad_center);
    button3.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent("com.freedomenu.activity_cobb_salad");
                    startActivity(intent);
                }

            }

    );
}
}
