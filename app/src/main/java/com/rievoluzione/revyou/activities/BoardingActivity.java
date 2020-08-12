package com.rievoluzione.revyou.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.rievoluzione.revyou.R;


public class BoardingActivity extends AppCompatActivity {

    public int cur_position = 0;
    public int prev_position = 0;
    public int moveTo = 0;
    ViewPager.PageTransformer pageTransformer = new ViewPager.PageTransformer() {
        private static final float MIN_SCALE = 0.85f;
        private static final float MIN_ALPHA = 0.5f;

        @Override
        public void transformPage(@NonNull View view, float position) {
            int pageWidth = view.getWidth();
            int pageHeight = view.getHeight();
            Log.d("transformPage", "transformPage: " + pageWidth + " -> " + position);

            if (position < -1) { // [-Infinity,-1)
                // This page is way off-screen to the left.
                view.setAlpha(0f);

            } else if (position <= 1) { // [-1,1]
                // Modify the default slide transition to shrink the page as well
                float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
                float vertMargin = pageHeight * (1 - scaleFactor) / 2;
                float horzMargin = pageWidth * (1 - scaleFactor) / 2;
                if (position < 0) {
                    view.setTranslationX(horzMargin - vertMargin / 2);
                } else {
                    view.setTranslationX(-horzMargin + vertMargin / 2);
                }

                // Scale the page down (between MIN_SCALE and 1)
                view.setScaleX(scaleFactor);
                view.setScaleY(scaleFactor);

                // Fade the page relative to its size.
                view.setAlpha(MIN_ALPHA +
                        (scaleFactor - MIN_SCALE) /
                                (1 - MIN_SCALE) * (1 - MIN_ALPHA));

            } else { // (1,+Infinity]
                // This page is way off-screen to the right.
                view.setAlpha(0f);
            }

        }
    };
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private RelativeLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            dots[position].setWidth(convertDpToPixel(10, getApplicationContext()));
            dots[position].setHeight(convertDpToPixel(10, getApplicationContext()));
            dots[position].setBackground(getResources().getDrawable(R.drawable.icx_dot_active));
            addBottomDots(position);
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            Log.d("onPageScrolled", "onPageScrolled: " +
                    "arg0 = " + arg0 + " ; " +
                    "arg1 = " + arg1 + " ; " +
                    "arg2 = " + arg2 + " ; "
            );
            if (arg1 > 0) {
                int tmp1 = 0;
                int tmp2 = 0;
                Log.d("onPageScrolledtTOO 2", "before -> onPageScrolled: " + moveTo);
                moveTo = (moveTo == 0) && (arg2 > 1000) ? 2 : 1;
                Log.d("onPageScrolledtTOO 2", "onPageScrolled: => " + arg2 + " ->" + (arg2 > 1000));
                Log.d("onPageScrolledtTOO 2", "after -> onPageScrolled: " + moveTo);

                if (moveTo == 1) {
                    tmp1 = (int) (25 * arg1);
                    tmp2 = -1 * (int) (25 * (arg1));
                } else {
                    tmp1 = -1 * (int) (25 * arg1);
                    tmp2 = (int) (25 * (arg1));
                }
                Log.d("onPageScrolledtTOO", "onPageScrolled: " + moveTo);
                if (moveTo == 1) {
                    dots[arg0].setTranslationX(convertDpToPixel(tmp1, getApplicationContext()));
                    dots[arg0 + 1].setTranslationX(convertDpToPixel(tmp2, getApplicationContext()));
                } else {
                    dots[arg0].setTranslationX(convertDpToPixel(tmp1, getApplicationContext()));
                    dots[arg0 - 1].setTranslationX(convertDpToPixel(tmp2, getApplicationContext()));
                }

                Log.d("onPageScrolled arg0", "onPageScrolled: " + arg0
                        + " ; tmp1 = " + tmp1
                        + " ; tmp2 = " + tmp2
                        + " ; x" + arg0 + " = " + convertPixelsToDp((int) dots[arg0].getTranslationX(), getApplicationContext())
                        + " ; x" + (arg0 + 1) + " = " + convertPixelsToDp((int) dots[arg0 + 1].getTranslationX(), getApplicationContext())
                );

//                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.WRAP_CONTENT,
//                        RelativeLayout.LayoutParams.WRAP_CONTENT
//                );
//                lp.setMargins(0,0,convertDpToPixel(tmp1, getApplicationContext()),0);
//                dots[arg0].setLayoutParams(lp);
//                lp.setMargins(convertDpToPixel(tmp2, getApplicationContext()),0,0,0);
//
//                if ((arg0 + 1)< dots.length) {
//                    dots[arg0 + 1].setLayoutParams(lp);
//                } else {
//                    dots[arg0 + 1].setLayoutParams(lp);
//                }

            } else {
                if (((int) arg1) == 0 && arg2 == 0) {
//                    dots[arg0].setWidth(convertDpToPixel(10, getApplicationContext()));
//                    dots[arg0].setHeight(convertDpToPixel(10, getApplicationContext()));
//                    dots[arg0].setBackground(getResources().getDrawable(R.drawable.icx_dot_active));
                    for (int i = 0; i < layouts.length; i++) {
                        dots[i].setTranslationX(convertDpToPixel(0, getApplicationContext()));
                        Log.d("onPageScrollState", "onPageSelected: " + i + " -> " + dots[i].getTranslationX());
                    }
                }
            }
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
            Log.d("onPageScrollState", "onPageScrollStateChanged: " + arg0);
            if (arg0 == 0){
                moveTo = 0;
                Log.d("onPageScrolledtTOO 2", "after selected ---> " + moveTo);
            }
        }
    };
    private Button btnNext;
    private Session session;

    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp      A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static int convertDpToPixel(int dp, Context context) {
        return dp * ((int) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * @param px      A value in px (pixels) unit. Which we need to convert into db
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent dp equivalent to px value
     */
    public static int convertPixelsToDp(int px, Context context) {
        return px / ((int) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Checking for first time launch - before calling setContentView()
         */
        // session = new Session(this);
        /*if (!session.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }*/


        /**
         * Making notification bar transparent
         */
//        if (Build.VERSION.SDK_INT >= 21) {
//            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//        }

        setContentView(R.layout.activity_boarding);

        viewPager = findViewById(R.id.view_pager);
        dotsLayout = findViewById(R.id.layoutDots);
        btnNext = findViewById(R.id.btn_next);
        /**
         * layouts of all welcome sliders
         * add few more layouts if you want
         */
        layouts = new int[]{
                R.layout.welcome_slide1,
                R.layout.welcome_slide2,
                R.layout.welcome_slide2,
                R.layout.welcome_slide3
        };

        dotSetup();
        changeStatusBarColor();

        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
        viewPager.setPageTransformer(true, pageTransformer);


        btnNext.setOnClickListener(v -> {
            // checking for last page
            // if last page home screen will be launched
            int current = getItem(+1);
            if (current < layouts.length) {
                // move to next screen
                viewPager.setCurrentItem(current);
            } else {
                launchHomeScreen();
            }
        });
    }

    public void dotSetup() {
        dots = new TextView[layouts.length];
        Log.d("dotSetup", "dotSetup: " + dots.length);
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setBackground(getResources().getDrawable(R.drawable.icx_dot_inactive));
            dots[i].setWidth(convertDpToPixel(8, getApplicationContext()));
            dots[i].setHeight(convertDpToPixel(8, getApplicationContext()));

            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

            int margin = convertDpToPixel(i * 25, getApplicationContext());

            params.setMargins(margin, 0, 0, 0);
            params.addRule(RelativeLayout.CENTER_VERTICAL);
            dots[i].setLayoutParams(params);
            dotsLayout.addView(dots[i]);
        }
        if (dots.length != 0) {
            dots[0].setWidth(convertDpToPixel(10, getApplicationContext()));
            dots[0].setHeight(convertDpToPixel(10, getApplicationContext()));
            dots[0].setBackground(getResources().getDrawable(R.drawable.icx_dot_active));
        }
    }

    private void addBottomDots(int currentPage) {
        for (int i = 0; i < dots.length; i++) {
            if (currentPage != i) {
                dots[i].setBackground(getResources().getDrawable(R.drawable.icx_dot_inactive));
            }
        }
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    private void launchHomeScreen() {
        // session.setFirstTimeLaunch(false);
        startActivity(new Intent(BoardingActivity.this, MainActivity.class));
        finish();
    }

    /**
     * Making notification bar transparent
     */
    private void changeStatusBarColor() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//        }
    }

    /**
     * View pager adapter
     */
    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);

//            test commit
        }
    }
}