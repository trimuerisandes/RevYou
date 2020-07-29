package com.rievoluzione.revyou.activities;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.fragments.CercaFragment;
import com.rievoluzione.revyou.fragments.HomeFragment;
import com.rievoluzione.revyou.fragments.PreferitiFragment;
import com.rievoluzione.revyou.fragments.ProfilioFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main extends AppCompatActivity {


    Context mContext;
    final Fragment HomeFragment = new HomeFragment();
    final Fragment PreferitiFragment = new PreferitiFragment();
    final Fragment CercaFragment = new CercaFragment();
    final Fragment ProfilioFragment = new ProfilioFragment();
    Fragment activeFragment = HomeFragment;

    @BindView(R.id.navigation)
    ChipNavigationBar chipNavigationBar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
        mContext= this;

        FragmentManager fragmentManager = getSupportFragmentManager();

        /**
         * Load First Fragment
         */
        fragmentManager.beginTransaction().add(R.id.container,HomeFragment,"HomeFragment").commit();
        chipNavigationBar.setItemSelected(R.id.action_home,true);

        /**
         * on selected bottomnavigation
         */
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;

                switch (i) {

                    case R.id.action_home:
                        if (fragmentManager.findFragmentByTag("HomeFragment") == null){
                            fragmentManager.beginTransaction().add(R.id.container,HomeFragment,"HomeFragment").commit();
                        }
                        fragmentManager.beginTransaction().hide(activeFragment).show(HomeFragment).commit();
                        activeFragment = HomeFragment;
                        break;


                    case R.id.action_preferiti:
                        if (fragmentManager.findFragmentByTag("PreferitiFragment") == null){
                            fragmentManager.beginTransaction().add(R.id.container,PreferitiFragment,"PreferitiFragment").commit();
                        }
                        fragmentManager.beginTransaction().hide(activeFragment).show(PreferitiFragment).commit();
                        activeFragment = PreferitiFragment;
                        break;


                    case R.id.action_cerca:
                        if (fragmentManager.findFragmentByTag("CercaFragment") == null){
                            fragmentManager.beginTransaction().add(R.id.container,CercaFragment,"CercaFragment").commit();
                        }
                        fragmentManager.beginTransaction().hide(activeFragment).show(CercaFragment).commit();
                        activeFragment = CercaFragment;
                        break;


                    case R.id.action_profilio:
                        if (fragmentManager.findFragmentByTag("ProfilioFragment") == null){
                            fragmentManager.beginTransaction().add(R.id.container,ProfilioFragment,"ProfilioFragment").commit();
                        }
                        fragmentManager.beginTransaction().hide(activeFragment).show(ProfilioFragment).commit();
                        activeFragment = ProfilioFragment;
                        break;



                    default:

                }


            }
        });
    }


}
