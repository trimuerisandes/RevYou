package com.app.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

import com.app.revyou.R;

public class PrimaActivity extends AppCompatActivity {

    TextView textGradient;
    TextView titke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prima);
        textGradient = findViewById(R.id.prima);
        titke = findViewById(R.id.list1);

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