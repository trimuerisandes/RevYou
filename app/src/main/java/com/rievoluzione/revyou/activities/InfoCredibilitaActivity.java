package com.rievoluzione.revyou.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.rievoluzione.revyou.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class InfoCredibilitaActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_credibilita);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }

    @OnClick(R.id.link_valutazione_articoli)
    void linkValutazioneArticoli() {
        startActivity(new Intent(this, ValutazionedArticoliActivity.class));
    }
}
