package com.app.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.app.revyou.R;
import com.app.revyou.utils.Dialogs;

public class MainActivity extends AppCompatActivity {

    LinearLayout packageStarting;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        packageStarting = findViewById(R.id.packageStarting);


        packageStarting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogs.fab_onclick((Activity) context,getWindow().getDecorView().getRootView());
            }
        });


    }
}