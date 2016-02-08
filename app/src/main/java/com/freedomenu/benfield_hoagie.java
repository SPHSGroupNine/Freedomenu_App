package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class benfield_hoagie extends Activity {

    private static Button button;
    private static Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benfield_hoagie);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_benfield_hoagie_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.ham_and_swiss");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_benfield_hoagie_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.tuna_salad");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button2 = (Button) findViewById(R.id.button_benfield_hoagie_center);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.activity_benfield_hoagie_sandwich");
                        startActivity(intent);
                    }

                }

        );
    }
}
