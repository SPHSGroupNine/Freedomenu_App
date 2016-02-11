package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shrimp_salad extends Activity {

    private static Button button;
    private static Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shrimp_salad);
        OnClickButtonListener();
        OnClickButtonListener2();
    }
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_shrimp_salad_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.chicken_salad");
                        startActivity(intent);
                    }
                }
        );
    }
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_shrimp_salad_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.roast_beef");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button2 = (Button) findViewById(R.id.button_shrimp_salad_center);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.ShrimpSaladSandwich");
                        startActivity(intent);
                    }

                }

        );
    }
}
