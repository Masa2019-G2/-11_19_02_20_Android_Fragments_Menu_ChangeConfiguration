package com.telran.a19_02_20;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        StoreProvider.getInstance().setContext(this);
        super.onCreate();
    }
}
