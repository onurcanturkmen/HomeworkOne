package com.perimamoglu.homeworkone.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.perimamoglu.homeworkone.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashFragment extends Fragment {
    @BindView(R.id.imgLoading)
    ImageView imgLoading;
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_splash, container, false);
        ButterKnife.bind(this, view);
        inital();
        return view;
    }

    public void inital(){
        imgLoading.setImageDrawable(getResources().getDrawable(R.drawable.loading));
    }
}
