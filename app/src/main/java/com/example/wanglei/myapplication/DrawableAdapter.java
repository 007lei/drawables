package com.example.wanglei.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wanglei on 2017/9/1.
 */

public class DrawableAdapter extends BaseAdapter {

    private List<String> datas;
    private Context context;

    private LayoutInflater inflater;

    public DrawableAdapter (Context context,List<String> list){
        datas = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder;
        if(convertView ==null){
            holder = new Holder();
            convertView = (View) inflater.inflate(R.layout.item, null);
            holder.textView = (TextView) convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        }else {
            holder = (Holder) convertView.getTag();
        }
        holder.textView.setText(datas.get(position));
        return convertView;
    }

    class Holder{
        TextView textView;
    }
}
