package com.example.bojanstanisic.twofragments;

//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.SendData{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    void addFirstFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.add(android.R.id.content, FirstFragment.firstFragment());
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
//
//    void addSecondFragment() {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.add(android.R.id.content, SecondFragment.secondFragment());
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }


    @Override
    public void sendDataWhenButtonClicked(String text) {
        SecondFragment secondFragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.second_fragment);
        secondFragment.setText(text);
    }
}
