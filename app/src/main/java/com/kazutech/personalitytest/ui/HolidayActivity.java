package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class HolidayActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void initComponents(Bundle savedInstanceState) {
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_hiking)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_golfing)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_eatingout)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_reading)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;


    }

    @Override
    protected int getLayout() {
        return R.layout.activity_holiday;
    }

    @Override
    public void onClick(View view) {
        int v=view.getId();
        switch (v){
            case R.id.img_back:
                startActivity(new Intent(HolidayActivity.this,ProfessionActivity.class));
                finish();
                break;
            case R.id.img_hiking:
                startActivity(new Intent(HolidayActivity.this,ChooseMealActivity.class));
                finish();
                break;
            case R.id.img_golfing:
                startActivity(new Intent(HolidayActivity.this,ChooseMealActivity.class));
                finish();
                break;
            case R.id.img_eatingout:
                startActivity(new Intent(HolidayActivity.this,ChooseMealActivity.class));
                finish();
                break;
            case R.id.img_reading:
                startActivity(new Intent(HolidayActivity.this,ChooseMealActivity.class));
                finish();
                break;


        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(HolidayActivity.this,InitPlayActivity.class));
        finish();
    }
}
