package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;

public class RevyouersAdapter extends RecyclerView.Adapter<RevyouersAdapter.RevyoursHold> {

    private int count ;
    private Context mContext;

    public RevyouersAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public RevyoursHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_revyouers, parent, false);
        RevyoursHold holder = new RevyoursHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RevyoursHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class RevyoursHold extends RecyclerView.ViewHolder {


        public RevyoursHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
