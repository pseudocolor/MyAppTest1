package com.example.hari.myapplication;

/**
 * Created by hari on 4/27/2017.
 */


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import junit.framework.Test;

public class Test1Fragment extends Fragment{

    private static EditText editText1;
    private static EditText editText2;

    Test1Listener activityCommander;

    public interface Test1Listener{

        public void changeText(String topText, String bottomText);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{

            activityCommander = (Test1Listener) context;

        }catch(ClassCastException e){

            throw new ClassCastException(context.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_test1, container, false);

        editText1 = (EditText) view.findViewById(R.id.txtEditText1);
        editText2 = (EditText) view.findViewById(R.id.txtEditText2);
        final Button buttonClick = (Button) view.findViewById(R.id.btButton2);

        buttonClick.setOnClickListener(

                new View.OnClickListener(){
                    public void onClick(View view){

                        Log.i("Hari: ", " test");

                        buttonIsClicked(view);
                    }
                }

        );

        return view;
    }

    public void buttonIsClicked(View view){

        activityCommander.changeText(editText1.getText().toString(), editText2.getText().toString());
    }
}
