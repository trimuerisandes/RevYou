package com.rievoluzione.revyou.fragments;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ui.AppBarConfiguration;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.activities.Filtero;
import com.rievoluzione.revyou.activities.InfoCredibilitaActivity;
import com.rievoluzione.revyou.activities.InfoPraticitaActivity;
import com.rievoluzione.revyou.adapter.GridPreferitiAdapter;
import com.rievoluzione.revyou.utils.MyGridView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CercaFragment extends androidx.fragment.app.Fragment {


    private AppBarConfiguration mAppBarConfiguration;

    @BindView(R.id.btn_filtro)
    ImageView m_filtro;

    @BindView(R.id.grid_view)
    MyGridView gridView;

    @BindView(R.id.btn_ordina_per)
    TextView btn_ordina;

    public CercaFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_cerca, container, false);
        ButterKnife.bind(this, view);

        gridView.setAdapter(new GridPreferitiAdapter(getContext(), 10));
        btn_ordina.setOnClickListener(v -> fab_onclick(R.style.DialogScale, "Scale",
                getActivity(), getActivity().getWindow().getDecorView().getRootView(), R.layout.activity_dialog_ordina_per)
        );

        return view;

    }

    @OnClick(R.id.btn_filtro)
    void btn() {
        //drawerLayout.openDrawer(GravityCompat.END);
        Intent myIntent = new Intent(getActivity(), Filtero.class);
        ActivityOptions options =
                ActivityOptions.makeCustomAnimation(getContext(), R.anim.fade_in, R.anim.fade_out);
        getContext().startActivity(myIntent, options.toBundle());

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
                    startActivity(new Intent(activity.getApplicationContext(), InfoCredibilitaActivity.class));
                });
                LinearLayout layout_praticita = dialogView.findViewById(R.id.layout_praticita);
                layout_praticita.setOnClickListener(v -> {
                    startActivity(new Intent(activity.getApplicationContext(), InfoPraticitaActivity.class));
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


            alertDialog.getWindow().setBackgroundDrawable(null);
            alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            alertDialog.getWindow().getAttributes().windowAnimations = type;
            alertDialog.setCancelable(true);
            alertDialog.show();

        }

    }
}
