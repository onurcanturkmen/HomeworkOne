package com.perimamoglu.homeworkone;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.perimamoglu.homeworkone.adapter.CustomAdapter;
import com.perimamoglu.homeworkone.fragment.ListFragment;
import com.perimamoglu.homeworkone.fragment.SplashFragment;
import com.perimamoglu.homeworkone.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.splashContent, new SplashFragment(), "");
        fragmentTransaction.add(R.id.listContent, new ListFragment(), "");
        fragmentTransaction.commit();

    }
}
