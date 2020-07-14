package com.app.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.app.revyou.R;

import butterknife.OnCheckedChanged;

public class PrimaActivity extends AppCompatActivity {

    TextView textGradient;
    TextView titke;
    Button button;

    //CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
        Context context = this;
        textGradient = findViewById(R.id.prima);
        titke = findViewById(R.id.list1);
        button = findViewById(R.id.button);
        CheckBox cb = (CheckBox) findViewById(R.id.cbok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainHome.class);
                startActivity(intent);
            }
        });
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) { buttonView.setTextColor(getResources().getColor(R.color.blue));

                cb.append("-");
                //cb.append("-",0,0);}
                cb.setText("-"+ context); }
                if (!isChecked) { buttonView.setTextColor(getResources().getColor(R.color.colorTextDark1)); }
            }
        });

        titke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titke.setTextColor(getResources().getColorStateList(R.color.selector_txt));
            }
        });



        textGradient.setText("PRIMA DI INIZIARE".toUpperCase());

        TextPaint paint = textGradient.getPaint();
        float width = paint.measureText("PRIMA DI INIZIARE");

        Shader textShader = new LinearGradient(0, 0, width, textGradient.getTextSize(),
                new int[]{
                        Color.parseColor("#14A4C0"),
                        Color.parseColor("#12C493"),
                }, null, Shader.TileMode.CLAMP);
        textGradient.getPaint().setShader(textShader);



    }
}