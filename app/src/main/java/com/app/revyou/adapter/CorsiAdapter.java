package com.app.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.revyou.R;

public class CorsiAdapter extends RecyclerView.Adapter<CorsiAdapter.CorsiHold> {

    private int count ;
    private Context mContext;

    public CorsiAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public CorsiHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_corsi, parent, false);
        CorsiHold holder = new CorsiHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull CorsiHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class CorsiHold extends RecyclerView.ViewHolder {


        public CorsiHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
