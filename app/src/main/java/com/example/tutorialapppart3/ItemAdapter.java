package com.example.tutorialapppart3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater; //m for member of the class
    String[] items; // string array with items
    String[] prices; // string array with prices
    String[] description; // string array with description

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        description = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // abstract methodes
    @Override
    public int getCount() { // how many items are in this list
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position; // just ID
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


}
