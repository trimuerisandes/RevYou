package com.app.revyou.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.frgament_home, container, false);
        ButterKnife.bind(this,view);


        m_ultimate.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate3.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate4.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate5.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        m_ultimate6.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        UltimateAdapter ultimateAdapter = new UltimateAdapter(getContext(),5);
        ProssimeAdapter prossimeAdapter = new ProssimeAdapter(getContext(),5);
        MiglioriAdapter miglioriAdapter = new MiglioriAdapter(getContext(),5);
        ArgomentiAdapter argomentiAdapter = new ArgomentiAdapter(getContext(),5);
        CorsiAdapter corsiAdapter = new CorsiAdapter(getContext(),5);
        m_ultimate.setAdapter(ultimateAdapter);
        m_ultimate1.setAdapter(prossimeAdapter);
        m_ultimate2.setAdapter(miglioriAdapter);
        m_ultimate3.setAdapter(miglioriAdapter);
        m_ultimate4.setAdapter(miglioriAdapter);
        m_ultimate5.setAdapter(argomentiAdapter);
        m_ultimate6.setAdapter(corsiAdapter);



        return view;

    }
}
