package com.app.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.revyou.R;



public class MainActivity extends AppCompatActivity {

    LinearLayout packageStarting;
    LinearLayout packageStarting1;
    LinearLayout packageStarting2;
    Context context;
    TextView textGradient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textGradient = findViewById(R.id.Abbonamento);
        packageStarting = findViewById(R.id.packageStarting);
        packageStarting1 = findViewById(R.id.packageStarting1);
        packageStarting2 = findViewById(R.id.packageStarting2);


        textGradient.setText("Abbonamento annuale".toUpperCase());

        TextPaint paint = textGradient.getPaint();
        float width = paint.measureText("Abbonamento annuale");

        Shader textShader = new LinearGradient(0, 0, width, textGradient.getTextSize(),
                new int[]{
                        Color.parseColor("#14A4C0"),
                        Color.parseColor("#12C493"),
                }, null, Shader.TileMode.CLAMP);
        textGradient.getPaint().setShader(textShader);


        packageStarting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab_onclick(R.style.DialogScale, "Scale" ,(Activity) context,getWindow().getDecorView().getRootView());


            }
        });

        packageStarting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab_onclick(R.style.DialogScale, "Scale" ,(Activity) context,getWindow().getDecorView().getRootView());


            }
        });
        packageStarting2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab_onclick(R.style.DialogScale, "Scale" ,(Activity) context,getWindow().getDecorView().getRootView());


            }
        });


    }
    private void fab_onclick(int type, String message, Activity activity, View view) {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        //ViewGroup viewGroup = view.findViewById(android.R.id.content);

        if (view == null) {

        } else {
            //then we will inflate the custom alert dialog xml that we created
            View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.activity_dialog_acced, null, false);


            //Now we need an AlertDialog.Builder object
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

            //SweetAlertDialog builder1 = new SweetAlertDialog(view.getContext());

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

            // Set the width and height for the layout parameters
            // This will bet the width and height of alert dialog
            layoutParams.width = dialogWindowWidth;
            layoutParams.height = dialogWindowHeight;


            // Apply the newly created layout parameters to the alert dialog window
            alertDialog.getWindow().setAttributes(layoutParams);
            RelativeLayout lyt = dialogView.findViewById(R.id.root_layout);
            //ImageView product = dialogView.findViewById(R.id.btn_product);
            //Button my_story = dialogView.findViewById(R.id.btn_my_story);

            lyt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                }
            });

            //alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.getWindow().setBackgroundDrawable(null);
            alertDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            alertDialog.getWindow().getAttributes().windowAnimations = type;
            alertDialog.setCancelable(true);
            alertDialog.show();

        }

    }


}