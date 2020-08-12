package com.rievoluzione.revyou.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rievoluzione.revyou.R;

import butterknife.OnClick;

public class AuthActivity extends AppCompatActivity {

    Button registration;
    private int[] layouts;
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        registration = (Button) findViewById(R.id.btnProva);
       /* NestedScrollView scrollView = (NestedScrollView) findViewById (R.id.nestedScrollView);
        scrollView.setFillViewport (true);*/

        viewPager.isHorizontalScrollBarEnabled();


        layouts = new int[]{
                R.layout.fragment_registrazione,
                R.layout.fragment_login};
        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
        //viewPager.setUser


        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });

        registration.setOnClickListener(v -> {

            int current = getItem(+1);
            if (current < layouts.length) {
                viewPager.setCurrentItem(current);

            }else {
                //launchHomeScreen();
                launchNextScreen();
            }

        });


    }
    public void launchNextScreen() {
        startActivity(new Intent(AuthActivity.this, MainActivity.class));
        finish();
    }

    /*@Override
    public void onBackPressed() {

        if (viewPager.getCurrentItem() != 0) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1,false);
        }else{
            finish();
        }

    }*/
    @OnClick(R.id.btnBack)
    public void onBackPressed() {
        //onBackPressed();
        if (viewPager.getCurrentItem() != 0) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1,false);
        }else{
            finish();
        }
    }


    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {

            // changing the next button text 'NEXT' / 'GOT IT'
            if (position == layouts.length - 1) {
                // last page. make button text to GOT IT
                registration.setText(getString(R.string.Start));
                //btnSkip.setVisibility(View.INVISIBLE);
            } else {
                // still pages are left
                registration.setText(getString(R.string.Start));
                //btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;
        private boolean swipeEnabled;

        public MyViewPagerAdapter() {

        }


        //  public class MyViewPagerAdapter extends PagerAdapter

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
        }

    }

}