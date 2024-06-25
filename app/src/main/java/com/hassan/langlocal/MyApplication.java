package com.hassan.langlocal;


import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

public class MyApplication
        extends Application {

    @Override
    protected void attachBaseContext(Context baseContext) {
        super.attachBaseContext(new LocaleManager_CA(baseContext).SetLocale());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        new LocaleManager_CA(this).SetLocale();
    }
}