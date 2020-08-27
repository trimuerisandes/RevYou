package com.rievoluzione.revyou.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.activities.AbbonamentoActivity;
import com.rievoluzione.revyou.activities.ArgomentiActivity;
import com.rievoluzione.revyou.activities.OrarioNotificheActivity;
import com.rievoluzione.revyou.activities.RevyouersActivity;
import com.rievoluzione.revyou.activities.SuggerimentiActivity;
import com.rievoluzione.revyou.activities.ValuatizoneArticoliActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ProfilioFragment extends androidx.fragment.app.Fragment {

    @BindView(R.id.lyt_abbonamento)
    LinearLayout m_abbonamento;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_profilio, container, false);
        ButterKnife.bind(this,view);
        return view;

    }

    @OnClick(R.id.lyt_abbonamento) void abbonamento(){
        Intent intent = new Intent(getContext(), AbbonamentoActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_suggerimenti) void suggerimenti(){
        Intent intent = new Intent(getContext(), SuggerimentiActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_argomenti) void argomenti(){
        Intent intent = new Intent(getContext(), ArgomentiActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_revyouers) void revyouers(){
        Intent intent = new Intent(getContext(), RevyouersActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_valutazione) void valutazione(){
        Intent intent = new Intent(getContext(), ValuatizoneArticoliActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.giorno) void giorno(){
        Intent intent = new Intent(getContext(), OrarioNotificheActivity.class);
        startActivity(intent);
    }
}
