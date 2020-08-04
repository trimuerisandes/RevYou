package com.rievoluzione.revyou.activities;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.rievoluzione.revyou.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ValutazionedArticoliActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valutazioned_articoli);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }
}
