package com.example.hari.myapplication;

/**
 * Created by hari on 4/27/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Bg1Fragment extends Fragment{

    private static TextView textView1;
    private static TextView textView2;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_bg1, container, false);

        textView1 = (TextView) view.findViewById(R.id.txtText1);
        textView2 = (TextView) view.findViewById(R.id.txtText2);

        return view;
    }

    public void setChangeText(String text1, String text2){

        textView1.setText(text1);
        textView2.setText(text2);
    }



}
