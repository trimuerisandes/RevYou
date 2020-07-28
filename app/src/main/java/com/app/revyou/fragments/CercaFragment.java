package com.app.revyou.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.app.revyou.R;
import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CercaFragment extends androidx.fragment.app.Fragment  {


    private AppBarConfiguration mAppBarConfiguration;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @BindView(R.id.btn_filtro)
    ImageView m_filtro;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    public CercaFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_cerca, container, false);
        ButterKnife.bind(this, view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawerLayout)
                .build();

//        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(getActivity(), navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
        return view;

    }

    @OnClick(R.id.btn_filtro) void btn(){
        drawerLayout.openDrawer(GravityCompat.END);
    }
}
