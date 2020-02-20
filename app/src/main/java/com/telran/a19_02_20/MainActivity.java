package com.telran.a19_02_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    PersonListFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        StoreProvider.getInstance().setContext(this);
        super.onCreate(savedInstanceState);
        fragment = (PersonListFragment) getLastCustomNonConfigurationInstance();
        if(fragment == null){
            fragment = new PersonListFragment();
        }
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root,fragment)
                .commit();
    }


    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return fragment;
    }
}
