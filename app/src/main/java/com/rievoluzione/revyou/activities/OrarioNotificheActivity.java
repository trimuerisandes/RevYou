package com.rievoluzione.revyou.activities;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.rievoluzione.revyou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrarioNotificheActivity extends AppCompatActivity {

    LinearLayout packageStarting;
    CheckBox textM, textN, textG, textV, textS, textD;
    CheckedTextView textL;
    Context context;

    @BindView(R.id.timepicker)
    TimePicker m_timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_orario_notifiche);
        ButterKnife.bind(this);
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
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textN.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textV.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        textD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    //buttonView.setBackground(getResources().getDrawable(R.drawable.bg_blue));
                    buttonView.setBackgroundColor(getResources().getColor(R.color.blue));
                    buttonView.setTextColor(getResources().getColor(R.color.colorWhite));

                }
                if (!isChecked) {
                    buttonView.setTextColor(getResources().getColor(R.color.text1));
                    buttonView.setBackground(getResources().getDrawable(R.drawable.bg_gradient));
                }
            }
        });
        m_timepicker.setIs24HourView(false);

    }

    @OnClick(R.id.btn_back)
    void btnBack() {
        onBackPressed();
    }

}