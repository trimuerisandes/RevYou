package com.rievoluzione.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.rievoluzione.revyou.R;

public class OrarioNotificheActivity extends AppCompatActivity {

    LinearLayout packageStarting;
    CheckBox textM, textN, textG, textV, textS, textD;
    CheckedTextView textL;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_orario_notifiche);
        context = this;
        packageStarting = findViewById(R.id.packageStarting);
        //textL = findViewById(R.id.text_L);
        textM = findViewById(R.id.text_M);
        textN = findViewById(R.id.text_N);
        textG = findViewById(R.id.text_G);
        textV = findViewById(R.id.text_V);
        textS = findViewById(R.id.text_S);
        textD = findViewById(R.id.text_D);


        CheckBox checkBox = (CheckBox) findViewById(R.id.text_L);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textV.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked){
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });


    }


}