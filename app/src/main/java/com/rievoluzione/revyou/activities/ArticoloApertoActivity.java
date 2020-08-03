package com.rievoluzione.revyou.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.adapter.MiglioriAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ArticoloApertoActivity extends Activity {

    @BindView(R.id.recylerview_articolo_correlati)
    RecyclerView m_articolo_correlati;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articolo_aperto);
        ButterKnife.bind(this);
        m_articolo_correlati.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        MiglioriAdapter miglioriAdapter = new MiglioriAdapter(getApplicationContext(), 5);
        m_articolo_correlati.setAdapter(miglioriAdapter);
        m_articolo_correlati.setAdapter(miglioriAdapter);
        m_articolo_correlati.setAdapter(miglioriAdapter);
    }

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }
}
