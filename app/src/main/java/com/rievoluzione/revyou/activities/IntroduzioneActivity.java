package com.rievoluzione.revyou.activities;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.rievoluzione.revyou.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class IntroduzioneActivity extends AppCompatActivity {


    ViewPager.OnPageChangeListener viewPagerPageChangeListener;

    @BindView(R.id.layout_fontsize_control)
    RelativeLayout m_layout_fontsize_control;

    @BindView(R.id.view_pager_intro)
    ViewPager viewPager;

    @BindView(R.id.layoutSliderBar)
    LinearLayout dotsLayout;

    @BindView(R.id.imv_favorites)
    ImageView m_imv_favorites;

    @BindView(R.id.imv_cuffie)
    ImageView m_imv_cuffie;

    @BindView(R.id.imv_condividi)
    ImageView m_imv_condividi;

    @BindView(R.id.imv_testo)
    ImageView m_imv_testo;
    boolean isFavoritesClicked = false;
    boolean isTestoClicked = false;
    boolean isCuffieClicked = false;
    boolean isCondividiClicked = false;
    @BindView(R.id.layoutPlayer)
    RelativeLayout m_layoutPlayer;
    private MyViewPagerAdapter myViewPagerAdapter;
    private TextView[] dots;
    private int[] layouts;

    public static int convertDpToPixel(int dp, Context context) {
        return dp * ((int) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static int convertPixelsToDp(int px, Context context) {
        return px / ((int) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_iphone_x_xs_11_pro_1);
        ButterKnife.bind(this);
        /**
         * layouts of all sliders
         * add few more layouts if you want
         */
        layouts = new int[]{
                R.layout.slide_introduzione,
                R.layout.slide_materiali_e_metodi,
                R.layout.slide_contenuti,
                R.layout.slide_conclusioni,
                R.layout.slide_il_parere_del_revyouer,
        };

        dots = new TextView[layouts.length];
        int lengthdots = layouts.length;

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setBackground(getResources().getDrawable(R.drawable.icx_dot_inactive));
            dots[i].setWidth(convertDpToPixel(7, getApplicationContext()));
            dots[i].setHeight(convertDpToPixel(7, getApplicationContext()));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            // config dots margin right and left
            if ((i != 0) && (i != (lengthdots - 1))) {
                int margin = convertDpToPixel(31, getApplicationContext());
                params.setMargins(margin, 0, margin, 0);
            } else if (i == 0) {
                int margin = convertDpToPixel(45, getApplicationContext());
                params.setMargins(margin, 0, 31, 0);
            } else {
                int margin = convertDpToPixel(45, getApplicationContext());
                params.setMargins(32, 0, margin, 0);
            }

            dots[i].setLayoutParams(params);

            dotsLayout.addView(dots[i]);
        }

        changeDotPosition(0);

        viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                changeDotPosition(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        };

        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

    }

    private void changeDotPosition(int currentPage) {
        for (int i = 0; i < dots.length; i++) {
            if (currentPage == i) {
                dots[currentPage].setWidth(convertDpToPixel(7, getApplicationContext()));
                dots[currentPage].setHeight(convertDpToPixel(7, getApplicationContext()));
                dots[currentPage].setBackground(getResources().getDrawable(R.drawable.icx_dot_black));
            } else {
                dots[i].setBackground(getResources().getDrawable(R.drawable.icx_dot_grey));
            }
        }
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    @OnClick(R.id.imv_testo)
    void clickTesto() {
        if (!isTestoClicked) {
            m_imv_testo.setImageResource(R.drawable.ic_testo_blue);
            m_layout_fontsize_control.setVisibility(View.VISIBLE);
            this.isTestoClicked = true;
        } else {
            this.isTestoClicked = false;
            m_imv_testo.setImageResource(R.drawable.ic_testo);
            m_layout_fontsize_control.setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.imv_favorites)
    void clickFavorites() {
        if (!isFavoritesClicked) {
            m_imv_favorites.setImageResource(R.drawable.pic_mask_group_23);
            this.isFavoritesClicked = true;
        } else {
            this.isFavoritesClicked = false;
            m_imv_favorites.setImageResource(R.drawable.ic_favorites);
        }
    }

    @OnClick(R.id.imv_cuffie)
    void clickCuffie() {
        if (!isCuffieClicked) {
            m_imv_cuffie.setImageResource(R.drawable.ic_mask_group_30);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    convertDpToPixel(66, getApplicationContext())
            );
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            m_layoutPlayer.setLayoutParams(layoutParams);
            this.isCuffieClicked = true;
        } else {
            this.isCuffieClicked = false;
            m_imv_cuffie.setImageResource(R.drawable.ic_cuffie);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    convertDpToPixel(0, getApplicationContext())
            );
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            m_layoutPlayer.setLayoutParams(layoutParams);
        }
    }

    @OnClick(R.id.imv_condividi)
    void clickCondividi() {
        if (!isCondividiClicked) {
            m_imv_condividi.setImageResource(R.drawable.pic_mask_group_25);
            this.isCondividiClicked = true;
        } else {
            this.isCondividiClicked = false;
            m_imv_condividi.setImageResource(R.drawable.ic_condividi);
        }
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
        }
    }
}