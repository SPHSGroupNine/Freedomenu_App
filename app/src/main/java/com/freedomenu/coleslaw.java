package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coleslaw extends Activity {

    private static Button button;
    private static Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coleslaw);
        OnClickButtonListener();
        OnClickButtonListener2();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_coleslaw_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.potato_salad");
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
                        Intent intent = new Intent("com.freedomenu.baked_beans");
                        startActivity(intent);
                    }

                }

        );
    }
}