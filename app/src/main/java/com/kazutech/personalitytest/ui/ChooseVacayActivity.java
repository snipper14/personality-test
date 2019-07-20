package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ChooseVacayActivity extends BaseActivity implements View.OnClickListener {



    @Override
    protected void initComponents(Bundle savedInstanceState) {
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_beach)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_bush)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_mountains)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_cities)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_choose_vacay;
    }

    @Override
    public void onClick(View view) {
        int v=view.getId();
        switch (v){
            case R.id.card_beach:
                loadClass(ChooseCarPurposeActivity.class);
                finish();
                break;
            case R.id.card_bush:
                loadClass(ChooseCarPurposeActivity.class);
                finish();
                break;
            case R.id.card_mountains:
                loadClass(ChooseCarPurposeActivity.class);
                finish();
                break;
            case R.id.card_cities:
                loadClass(ChooseCarPurposeActivity.class);
                finish();
                break;
            case R.id.img_back:
                loadClass(ChooseHomeActivity.class);
                finish();
                break;
        }

    }
    private void loadClass(Class<?> classToLoad) {
        startActivity(new Intent(ChooseVacayActivity.this, classToLoad));
        finish();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ChooseVacayActivity.this, InitPlayActivity.class));
        finish();
    }
}
