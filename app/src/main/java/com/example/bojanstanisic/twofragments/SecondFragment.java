package com.example.bojanstanisic.twofragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private TextView mText ;







    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment secondFragment(){
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        mText = (TextView) rootView.findViewById(R.id.textView2);
        return rootView;

    }

    public void setText(String message  ){
        mText.setText(message);
    }

}
