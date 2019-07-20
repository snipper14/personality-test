package com.kazutech.personalitytest.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract  class BaseActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(getLayout());

        } catch (Exception e) {
            e.printStackTrace();
        }

        initComponents(savedInstanceState);


    }

    protected abstract void initComponents(Bundle savedInstanceState);

    protected abstract int getLayout();


    protected void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}