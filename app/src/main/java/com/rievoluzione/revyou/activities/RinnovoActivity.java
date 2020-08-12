package com.rievoluzione.revyou.activities;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rievoluzione.revyou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RinnovoActivity extends AppCompatActivity {


    @BindView(R.id.txt_rinnovo)
    TextView m_rinnovo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rinnovo);
        ButterKnife.bind(this);




    }

    @OnClick(R.id.btn_back) void back(){
        onBackPressed();
    }
}
