package com.example.chinmoy.weatherapplicationone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chinmoy on 17-02-2017.
 */

public class MyAdapter extends BaseAdapter {
    private final List<Item> mItem = new ArrayList<Item>();
    private final LayoutInflater mInflator;

    public MyAdapter(Context context) {
        mInflator = LayoutInflater.from(context);

        mItem.add(new Item("BioData", R.drawable.android));
        mItem.add(new Item("Growth Monitor", R.drawable.androidd));
        mItem.add(new Item("Immunization Tracker", R.drawable.androidd));
        mItem.add(new Item("Oral Dehydration", R.drawable.androidd));
    }

    @Override
    public int getCount() {
        return mItem.size();
    }

    @Override
    public Object getItem(int i) {
        return mItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItem.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflator.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = (Item) getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
