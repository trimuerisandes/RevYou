package com.rievoluzione.revyou.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.adapter.MyFragmentPagerAdapter;
import com.rievoluzione.revyou.fragments.FragmentAnnullamen2;
import com.rievoluzione.revyou.fragments.FragmentAnnullameno;
import com.rievoluzione.revyou.fragments.FragmentAnnullameno1;
import com.rievoluzione.revyou.fragments.FragmentAnnullameno3;
import com.rievoluzione.revyou.fragments.FragmentSondaggio;
import com.rievoluzione.revyou.fragments.FragmentSondaggio1;
import com.rievoluzione.revyou.fragments.FragmentSondaggio2;

import java.util.ArrayList;
import java.util.List;




 public class SondaggioActivity extends AppCompatActivity {


    TextView bottom_textview_a, bottom_textview_b, bottom_textview_c, bottom_textview_d;
    LinearLayout bottom_linearlayout_a, bottom_linearlayout_b, bottom_linearlayout_c, bottom_linearlayout_d, bottom_linearlayout_e, bottom_linearlayout_f;
    Button buttonVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sondaggio);
        final ViewPager2 viewpager = findViewById(R.id.activity_main_viewpager2_viewpage);
        List<Fragment> mFragments = new ArrayList<>();
        mFragments.add(new FragmentSondaggio());
        mFragments.add(new FragmentSondaggio1());
        mFragments.add(new FragmentSondaggio2());
        MyFragmentPagerAdapter mAdapter = new MyFragmentPagerAdapter(this, mFragments);
        viewpager.setAdapter(mAdapter);
        //viewpager.setUserInputEnabled(false);
        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                bottom_textview_a = (TextView) findViewById(R.id.bottom_textview_a);
                bottom_textview_b = (TextView) findViewById(R.id.bottom_textview_b);
                bottom_textview_c = (TextView) findViewById(R.id.bottom_textview_c);
                bottom_textview_d = (TextView) findViewById(R.id.bottom_textview_d);

                // bottom_textview_a.setTextColor(Color.rgb(88,216,216));
                bottom_textview_a.setTextColor(Color.BLACK);
                bottom_textview_b.setTextColor(Color.rgb(88, 88, 88));
                bottom_textview_c.setTextColor(Color.rgb(88, 88, 88));
                bottom_textview_d.setTextColor(Color.rgb(88, 88, 88));


                switch (position) {
                    case 0:
                        //bottom_textview_a.setTextColor(Color.rgb(216,216,216));
                        bottom_textview_a.setTextColor(Color.BLACK);
                    case 1:
                        bottom_textview_b.setTextColor(Color.rgb(216, 216, 216));

                    case 2:
                        bottom_textview_c.setTextColor(Color.rgb(216, 216, 216));

                    case 3:
                        bottom_textview_d.setTextColor(Color.rgb(216, 216, 216));


                }

                viewpager.setCurrentItem(position);
                LinearLayout bottom_linearlayout_a = (LinearLayout) findViewById(R.id.bottom_linearlayout_a);
                LinearLayout bottom_linearlayout_b = (LinearLayout) findViewById(R.id.bottom_linearlayout_b);
                LinearLayout bottom_linearlayout_c = (LinearLayout) findViewById(R.id.bottom_linearlayout_c);
                LinearLayout bottom_linearlayout_d = (LinearLayout) findViewById(R.id.bottom_linearlayout_d);


                buttonVal = (Button) findViewById(R.id.buttonVal);

                bottom_linearlayout_a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewpager.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewpager.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewpager.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                bottom_linearlayout_d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewpager.setCurrentItem(Integer.parseInt(String.valueOf(view.getTag())));
                    }
                });
                Button yourButton = (Button) findViewById(R.id.buttonVal);
                yourButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        viewpager.setCurrentItem(getItem(+1), true); //getItem(-1) for previous
                    }
                });



            }

            private int getItem(int i) {
                return viewpager.getCurrentItem() + i;
            }

        });

    }
}