
package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class EddysFamousBaklava extends Activity {


    private static Button button;
    private static Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baklava);
        OnClickButtonListener();
        OnClickButtonListener2();
    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_activity_baklava_no);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.baklava");
                        startActivity(intent);
                    }

                }

        );
    }    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_activity_baklava_yes);
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
}