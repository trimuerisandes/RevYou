package com.rievoluzione.revyou.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

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

    @BindView(R.id.layout_a_cura_di)
    LinearLayout m_layout_a_cura_di;
    @BindView(R.id.layout_pubblic)
    LinearLayout m_layout_pubblic;

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

        m_layout_a_cura_di.setOnClickListener(v -> fab_onclick(R.style.DialogScale, "Scale",
                this, getWindow().getDecorView().getRootView(), R.layout.activity_dialog_curatore)
        );

        m_layout_pubblic.setOnClickListener(v -> fab_onclick(R.style.DialogScale, "Scale",
                this, getWindow().getDecorView().getRootView(), R.layout.activity_dialog_pubblicazione)
        );
    }

    @OnClick(R.id.btnBack)
    void btnBack() {
        finish();
    }

    private void fab_onclick(int type, String message, Activity activity, View view, int layoutId) {

        if (view == null) {

        } else {
            //then we will inflate the custom alert dialog xml that we created
            View dialogView = LayoutInflater.from(view.getContext()).inflate(layoutId, null, false);


            //Now we need an AlertDialog.Builder object
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

            if (R.layout.activity_dialog_pubblicazione == layoutId) {
                LinearLayout layout_credibilita = dialogView.findViewById(R.id.layout_credibilita);
                layout_credibilita.setOnClickListener(v -> {
                    startActivity(new Intent(getApplicationContext(), InfoCredibilitaActivity.class));
                });
                LinearLayout layout_praticita = dialogView.findViewById(R.id.layout_praticita);
                layout_praticita.setOnClickListener(v -> {
                    startActivity(new Intent(getApplicationContext(), InfoPraticitaActivity.class));
                });
            }

            //setting the view of the builder to our custom view that we already inflated
            builder.setView(dialogView);


            //finally creating the alert dialog and displaying it
            final AlertDialog alertDialog = builder.create();


            // Get screen width and height in pixels
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            // The absolute width of the available display size in pixels.
            int displayWidth = displayMetrics.widthPixels;
            // The absolute height of the available display size in pixels.
            int displayHeight = displayMetrics.heightPixels;

            // Initialize a new window manager layout parameters
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

            // Copy the alert dialog window attributes to new layout parameter instance
            layoutParams.copyFrom(alertDialog.getWindow().getAttributes());


            // Set alert dialog width equal to screen width 70%
            int dialogWindowWidth = (int) (displayWidth * 0.9f);
            // Set alert dialog height equal to screen height 70%
            int dialogWindowHeight = (int) (displayHeight * 0.9f);

            layoutParams.width = dialogWindowWidth;
            layoutParams.height = dialogWindowHeight;


            // Apply the newly created layout parameters to the alert dialog window
            alertDialog.getWindow().setAttributes(layoutParams);
            RelativeLayout lyt = dialogView.findViewById(R.id.root_layout);

            lyt.setOnClickListener(view1 -> alertDialog.dismiss());

            ImageView btnClose = dialogView.findViewById(R.id.btnClose);
            btnClose.setOnClickListener(v -> alertDialog.dismiss());

            alertDialog.getWindow().setBackgroundDrawable(null);
            alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            alertDialog.getWindow().getAttributes().windowAnimations = type;
            alertDialog.setCancelable(true);
            alertDialog.show();

        }

    }
}
