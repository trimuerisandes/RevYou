package com.rievoluzione.revyou.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.rievoluzione.revyou.R;

public class AperturaActivity extends Activity {
    int leng = 1;
    ImageView im_logo_end;
    ImageView im_logo_end_2;
    ImageView im_logo_start;
    ImageView im_logo_start_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apertura);
        im_logo_end = findViewById(R.id.im_logo_end); // always show
        im_logo_end_2 = findViewById(R.id.im_logo_end_2); // second section
        im_logo_start = findViewById(R.id.im_logo_start); // first section
        im_logo_start_2 = findViewById(R.id.im_logo_start_2);// first section
        im_logo_end_2.setVisibility(View.VISIBLE);
        new CountDownTimer(6000, 1000) {
            public void onTick(long millisUntilFinished) {
                if (leng % 2 == 0) {
                    im_logo_end_2.setScaleY(1);
                    im_logo_start.setScaleY(0);
                    im_logo_end_2.animate().scaleY(0).setDuration(1000).setInterpolator(new DecelerateInterpolator()).start();
                    im_logo_start.animate().scaleY(1).setDuration(1000).setInterpolator(new DecelerateInterpolator()).start();

                } else {
                    im_logo_end_2.setScaleY(0);
                    im_logo_start.setScaleY(1);
                    im_logo_end_2.animate().scaleY(1).setDuration(1000).setInterpolator(new DecelerateInterpolator()).start();
                    im_logo_start.animate().scaleY(0).setDuration(1000).setInterpolator(new DecelerateInterpolator()).start();

                }
                leng++;
            }

            public void onFinish() {
                // finish off when we're all dead !
            }
        }.start();
        new Handler().postDelayed(() -> {
            startActivity(new Intent(AperturaActivity.this, MainActivity.class));
            finish();
        }, 6000);
    }
}
