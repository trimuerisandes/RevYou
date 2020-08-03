package com.rievoluzione.revyou.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rievoluzione.revyou.R;
import com.rievoluzione.revyou.adapter.GridPreferitiAdapter;
import com.rievoluzione.revyou.utils.MyGridView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PreferitiFragment extends androidx.fragment.app.Fragment {


    @BindView(R.id.grid_view)
    MyGridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_preferiti, container, false);
        ButterKnife.bind(this,view);



        gridView.setAdapter(new GridPreferitiAdapter(getContext(), 10));

        return view;

    }
}
