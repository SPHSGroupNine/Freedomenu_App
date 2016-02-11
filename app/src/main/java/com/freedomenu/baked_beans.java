package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class baked_beans extends Activity {

    private static Button button;
    private static Button button2;
    private static Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baked_beans);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_baked_beans_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.coleslaw");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_baked_beans_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.mac_and_cheese");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button3 = (Button) findViewById(R.id.button_baked_beans_center);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.BakedBeans");
                        startActivity(intent);
                    }

                }

        );
    }
}
