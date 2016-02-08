package com.freedomenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {

    private static Button button;
    private static Button button2;

    /*onCreate links the xml file "activity_main2" to this java file. It also calls on OnClickButtonListener() and OnClickButtonListener2()*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        OnClickButtonListener();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }

    /*OnClickButtonListener first links itself to a button in the xml, in this case button_salad_left (the left arrow on the salad slide), and makes it so the button brings the user to the "Beverages" slide */
    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button_salad_main_left);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.Beverages");
                        startActivity(intent);
                    }
                }
        );
    }

    /*same as OnClickButtonListener(), but for the right arrow button that leads to the "soups and sides" slide instead*/
    public void OnClickButtonListener2() {
        button2 = (Button) findViewById(R.id.button_salad_main_right);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.soups_sides");
                        startActivity(intent);
                    }

                }

        );
    }

    public void OnClickButtonListener3() {
        button2 = (Button) findViewById(R.id.button_salad_main_center);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.freedomenu.Salad");
                        startActivity(intent);
                    }

                }

        );
    }
}
