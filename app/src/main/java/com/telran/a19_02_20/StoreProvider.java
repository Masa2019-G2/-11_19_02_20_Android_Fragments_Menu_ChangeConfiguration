package com.telran.a19_02_20;

import android.content.Context;

public class StoreProvider {
    private static final StoreProvider instance = new StoreProvider();
    private Context context;

    public static StoreProvider getInstance(){
        return instance;
    }

    private StoreProvider() {

    }

    public void setContext(Context context) {
        this.context = context;
    }

    public boolean savePerson(Person p){
        return context.getSharedPreferences("PERSONS",Context.MODE_PRIVATE)
                .edit()
                .putString(p.name, p.toString())
                .commit();
    }
}
