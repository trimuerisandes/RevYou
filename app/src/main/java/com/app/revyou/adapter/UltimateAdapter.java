package com.app.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.app.revyou.R;

public class UltimateAdapter extends RecyclerView.Adapter<UltimateAdapter.UltimateHold> {

    private int count ;
    private Context mContext;

    public UltimateAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public UltimateHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_ultime, parent, false);
        UltimateAdapter.UltimateHold holder = new UltimateAdapter.UltimateHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull UltimateHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class UltimateHold extends RecyclerView.ViewHolder {


        public UltimateHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
