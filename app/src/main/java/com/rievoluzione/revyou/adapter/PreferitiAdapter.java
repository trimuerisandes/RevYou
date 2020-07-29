package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.rievoluzione.revyou.R;

import butterknife.ButterKnife;

public class PreferitiAdapter extends RecyclerView.Adapter<PreferitiAdapter.PreferitiViewHolder> {


    private Context mContext;

    public PreferitiAdapter(Context context){
        this.mContext =context;

    }


    @NonNull
    @Override
    public PreferitiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_preferiti, parent, false);
        PreferitiAdapter.PreferitiViewHolder holder = new PreferitiAdapter.PreferitiViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull PreferitiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class PreferitiViewHolder extends RecyclerView.ViewHolder {



        public PreferitiViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
