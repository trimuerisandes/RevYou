package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;

public class MiglioriAdapter extends RecyclerView.Adapter<MiglioriAdapter.MiglioriHold> {

    private int count ;
    private Context mContext;

    public MiglioriAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public MiglioriHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_migliori, parent, false);
        MiglioriHold holder = new MiglioriHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MiglioriHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class MiglioriHold extends RecyclerView.ViewHolder {


        public MiglioriHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
