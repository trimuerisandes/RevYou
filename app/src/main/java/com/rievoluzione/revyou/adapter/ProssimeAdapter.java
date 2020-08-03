package com.rievoluzione.revyou.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rievoluzione.revyou.R;

public class ProssimeAdapter extends RecyclerView.Adapter<ProssimeAdapter.ProssimeHold> {

    private int count ;
    private Context mContext;

    public ProssimeAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;
    }


    @NonNull
    @Override
    public ProssimeHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_prossime, parent, false);
        ProssimeHold holder = new ProssimeHold(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ProssimeHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return count;
    }

    public class ProssimeHold extends RecyclerView.ViewHolder {


        public ProssimeHold(View itemView) {
            super(itemView);
//            ButterKnife.bind(this, itemView);
        }
    }
}
