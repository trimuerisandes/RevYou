package com.rievoluzione.revyou.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rievoluzione.revyou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AbbonamentoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_abbonamento);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_back) void back(){
        onBackPressed();
    }

    @OnClick(R.id.btn_Piano) void piano(){
        Intent intent = new Intent(this, UpgradeActivity.class);
        startActivity(intent);
    }
}
