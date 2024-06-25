package com.hassan.langlocal;


import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {
    SharedPrefClass sharedPrefClass;
    boolean themeSwitchState;

    Button selectlanguage;


    @Override
    protected void attachBaseContext(Context baseContext) {
        super.attachBaseContext(new LocaleManager_CA(baseContext).SetLocale());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        new LocaleManager_CA(this).SetLocale();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        selectlanguage = findViewById(R.id.selectLanguageButton);
        selectlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMain.this, ActivitySelectLanguage.class);
                startActivity(intent);
            }
        });



    }

    public void initComponents() {

        sharedPrefClass = new SharedPrefClass(ActivityMain.this);
        themeSwitchState = sharedPrefClass.getThemeStatefromShared();
        if (themeSwitchState) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            new LocaleManager_CA(ActivityMain.this).SetLocale();
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            new LocaleManager_CA(ActivityMain.this).SetLocale();
        }

    }
}
