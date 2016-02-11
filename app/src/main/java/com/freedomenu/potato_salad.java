package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class potato_salad extends Activity {

    private static Button button;
    private static Button button2;
    private static Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potato_salad);
        OnClickButtonListener();
        OnClickButtonListener2();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_potato_salad_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.chip");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_potato_salad_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.coleslaw");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button3 = (Button) findViewById(R.id.button_potato_salad_center);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.PotatoSalad");
                        startActivity(intent);
                    }

                }

        );
    }
}
