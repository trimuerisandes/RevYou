package com.app.revyou.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.revyou.R;
import com.app.revyou.adapter.PreferitiAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PreferitiFragment extends androidx.fragment.app.Fragment {

    @BindView(R.id.recylerview)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_preferiti, container, false);
        ButterKnife.bind(this,view);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        PreferitiAdapter adapter = new PreferitiAdapter(getContext());
        recyclerView.setAdapter(adapter);

        return view;

    }
}
