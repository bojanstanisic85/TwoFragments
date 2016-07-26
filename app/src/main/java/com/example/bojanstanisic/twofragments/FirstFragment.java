package com.example.bojanstanisic.twofragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private SendData mListener;





    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment firstFragment(){
        FirstFragment fragment = new FirstFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        final EditText editTextField = (EditText)rootView.findViewById(R.id.editText);
        Button submitButton = (Button)rootView.findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.sendDataWhenButtonClicked(editTextField.getText().toString());
            }
        });
        return rootView;
        }


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof SendData) {
            mListener = (SendData) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement SendData");
        }
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }


    public interface SendData{
        void sendDataWhenButtonClicked(String message);
    }

}
