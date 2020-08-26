package com.rievoluzione.revyou.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rievoluzione.revyou.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Filtero extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtero_no_premium);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_back) void abbonamento(){
       onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.hold,R.anim.fade_out_right);

    }
}
