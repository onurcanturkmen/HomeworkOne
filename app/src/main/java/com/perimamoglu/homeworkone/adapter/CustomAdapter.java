package com.perimamoglu.homeworkone.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.perimamoglu.homeworkone.R;
import com.perimamoglu.homeworkone.model.Person;

import java.util.ArrayList;

/**
 * Created by testinium on 24/07/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private ArrayList<Person> personList;

    public CustomAdapter(Context context, ArrayList<Person> personList){
        this.personList = personList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Person getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View itemView = layoutInflater.inflate(R.layout.item_list, null);

        TextView txtName = itemView.findViewById(R.id.txtNickName);
        ImageView imgProfil = itemView.findViewById(R.id.imgProfil);

        txtName.setText(personList.get(i).getName());

        if (personList.get(i).getImageText().equals("0")){
            imgProfil.setImageResource(R.drawable.image0);
        }
        return itemView;
    }
}
