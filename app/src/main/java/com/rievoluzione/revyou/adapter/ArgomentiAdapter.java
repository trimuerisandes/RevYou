package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;

public class ArgomentiAdapter extends RecyclerView.Adapter<ArgomentiAdapter.ArgomentiHold> {

    private int count ;
    private Context mContext;

    public ArgomentiAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public ArgomentiHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_argomenti, parent, false);
        ArgomentiHold holder = new ArgomentiHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ArgomentiHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class ArgomentiHold extends RecyclerView.ViewHolder {


        public ArgomentiHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
