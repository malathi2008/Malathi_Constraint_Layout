package com.constraintlayout.malathi_constraint_layout;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View v){

        Snackbar snackbar = Snackbar.make(v, "WELCOME TO SNACKBAR.... MALATHI", Snackbar.LENGTH_LONG);
        snackbar.show();

    }

}
