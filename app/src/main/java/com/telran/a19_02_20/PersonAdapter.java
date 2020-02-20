package com.telran.a19_02_20;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends BaseAdapter {
    private List<Person> list;

    public PersonAdapter() {
        list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Person("Person " + i, "Phone "+ i));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_row,parent,false);
        }
        Person p = list.get(position);
        TextView nameTxt = convertView.findViewById(R.id.nameTxt);
        TextView phoneTxt = convertView.findViewById(R.id.phoneTxt);
        nameTxt.setText(p.name);
        phoneTxt.setText(p.phone);
        return convertView;
    }

    public void add(Person p){
        list.add(0,p);
        notifyDataSetChanged();
    }
}
