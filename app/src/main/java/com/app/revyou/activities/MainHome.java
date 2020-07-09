package com.app.revyou.activities;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.app.revyou.R;
import com.app.revyou.fragments.CercaFragment;
import com.app.revyou.fragments.HomeFragment;
import com.app.revyou.fragments.PreferitiFragment;
import com.app.revyou.fragments.ProfilioFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainHome extends AppCompatActivity {

    Context mContext;
    @BindView(R.id.navigation)
    ChipNavigationBar chipNavigationBar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.bind(this);
        mContext= this;

        Fragment f = new HomeFragment();
        chipNavigationBar.setItemSelected(R.id.action_home,true);
        loadFragment(f);


        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;

                switch (i) {
                    case R.id.action_home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.action_preferiti:
                        fragment = new PreferitiFragment();
                        break;

                    case R.id.action_cerca:
                        fragment = new CercaFragment();
                        break;

                    case R.id.action_profilio:
                        fragment = new ProfilioFragment();
                        break;
                }

                 loadFragment(fragment);
            }
        });
    }

    /**
     * switching fragment
     * @param fragment
     * @return
     */
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
