package com.app.revyou.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.transition.Fade;

import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import androidx.transition.Transition;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.revyou.R;
import com.app.revyou.adapter.ArgomentiAdapter;
import com.app.revyou.adapter.CorsiAdapter;
import com.app.revyou.adapter.MiglioriAdapter;
import com.app.revyou.adapter.ProssimeAdapter;
import com.app.revyou.adapter.UltimateAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeFragment extends androidx.fragment.app.Fragment {

    View view;


    @BindView(R.id.recylerview1)
    RecyclerView m_ultimate;
    @BindView(R.id.recylerview2)
    RecyclerView m_ultimate1;
    @BindView(R.id.recylerview3)
    RecyclerView m_ultimate2;
    @BindView(R.id.recylerview4)
    RecyclerView m_ultimate3;
    @BindView(R.id.recylerview5)
    RecyclerView m_ultimate4;
    @BindView(R.id.recylerview6)
    RecyclerView m_ultimate5;
    @BindView(R.id.recylerview7)
    RecyclerView m_ultimate6;

    @BindView(R.id.pic_subtraction)
    View m_subtraction;
    @BindView(R.id.paret_logo)
    View m_logo;
    @BindView(R.id.parent_main)
    View m_main;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frgament_home, container, false);

        ButterKnife.bind(this, view);

        //Load animation
        Animation slide_down = AnimationUtils.loadAnimation(getContext(),
                R.anim.slide_down);

        Animation slide_up = AnimationUtils.loadAnimation(getContext(),
                R.anim.slide_up);

// Start animation

//       ObjectAnimator objectanimator = ObjectAnimator.ofFloat(m_subtraction,"y",500);
//        objectanimator.setDuration(4000);
//        objectanimator.start();

//        m_subtraction.animate().translationY(0);

//        m_subtraction.setVisibility(View.VISIBLE);
//        TranslateAnimation animate = new TranslateAnimation(
//                0,                 // fromXDelta
//                0,                 // toXDelta
//                -m_subtraction.getHeight(),  // fromYDelta
//                0);                // toYDelta
//        animate.setDuration(500);
//        animate.setFillAfter(true);
//        m_subtraction.startAnimation(animate);



        m_ultimate.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate3.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate4.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate5.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate6.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        UltimateAdapter ultimateAdapter = new UltimateAdapter(getContext(), 5);
        ProssimeAdapter prossimeAdapter = new ProssimeAdapter(getContext(), 5);
        MiglioriAdapter miglioriAdapter = new MiglioriAdapter(getContext(), 5);
        ArgomentiAdapter argomentiAdapter = new ArgomentiAdapter(getContext(), 5);
        CorsiAdapter corsiAdapter = new CorsiAdapter(getContext(), 5);
        m_ultimate.setAdapter(ultimateAdapter);
        m_ultimate1.setAdapter(prossimeAdapter);
        m_ultimate2.setAdapter(miglioriAdapter);
        m_ultimate3.setAdapter(miglioriAdapter);
        m_ultimate4.setAdapter(miglioriAdapter);
        m_ultimate5.setAdapter(argomentiAdapter);
        m_ultimate6.setAdapter(corsiAdapter);


        m_subtraction.startAnimation(slide_down);
        m_logo.startAnimation(slide_down);
        m_main.startAnimation(slide_up);

//        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(m_main,"y",m_logo.getHeight());
//        objectanimator2.setDuration(4000);
//        objectanimator2.start();


        return view;

    }



}


