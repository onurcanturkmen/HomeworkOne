package com.perimamoglu.homeworkone.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.perimamoglu.homeworkone.R;
import com.perimamoglu.homeworkone.adapter.CustomAdapter;
import com.perimamoglu.homeworkone.model.Person;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    View view;
    private ArrayList<Person> personList;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list, container, false);
        inital();
        return view;
    }

    private void inital(){
        personList = new ArrayList<>();
        listView = (ListView) view.findViewById(R.id.lvList);

        personList.add(new Person("Ahmet Yılmaz","0"));
        personList.add(new Person("dcfvgbh","0"));
        personList.add(new Person("fgbf","0"));
        personList.add(new Person("hjghfv","0"));
        personList.add(new Person("fghyujhgfv","0"));


        CustomAdapter customAdapter = new CustomAdapter(getActivity(), personList);
        listView.setAdapter(customAdapter);
    }
}
