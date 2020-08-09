package com.rievoluzione.revyou.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.adapter.RevyouersAdapter;
import com.rievoluzione.revyou.adapter.UltimateAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RevyouersActivity extends AppCompatActivity {


    @BindView(R.id.recylerview)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rivyouers);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        RevyouersAdapter rinnovoActivity = new RevyouersAdapter(this, 10);
        recyclerView.setAdapter(rinnovoActivity);

    }

    @OnClick(R.id.btn_back) void back(){
        onBackPressed();
    }
}
