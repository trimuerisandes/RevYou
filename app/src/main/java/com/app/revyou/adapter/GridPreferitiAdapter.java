package com.app.revyou.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.revyou.R;


public class GridPreferitiAdapter extends BaseAdapter {

    private Context mContex;
    int count ;

    public GridPreferitiAdapter(Context mContex,int count ) {
        this.mContex = mContex;
        this.count = count;
    }


    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContex
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LayoutInflater inf = LayoutInflater.from(mContex);

        if (convertView == null) {

            grid = new View(mContex);
            grid = inf.inflate(R.layout.single_list_preferiti, null);


        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
