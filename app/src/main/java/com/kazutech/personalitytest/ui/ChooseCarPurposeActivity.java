package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ChooseCarPurposeActivity extends BaseActivity implements View.OnClickListener {



    @Override
    protected void initComponents(Bundle savedInstanceState) {
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_car_bussiness)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_car_pleasure)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_car_adventure)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_car_getting_around)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);


    }

    @Override
    protected int getLayout() {
        return R.layout.activity_choose_car_purpose;
    }

    @Override
    public void onClick(View view) {
          int v=view.getId();
          switch (v){
              case R.id.img_back:
                  startActivity(new Intent(ChooseCarPurposeActivity.this,ChooseVacayActivity.class));
                  finish();
                  break;
              case R.id.card_car_bussiness:
                  startActivity(new Intent(ChooseCarPurposeActivity.this, ModelTransporterActivity.class));
                  finish();
                  break;
              case R.id.card_car_pleasure:
                  startActivity(new Intent(ChooseCarPurposeActivity.this, ModelPleasureActivity.class));
                  finish();
                  break;

              case R.id.card_car_adventure:
                  startActivity(new Intent(ChooseCarPurposeActivity.this, ModelAdventureActivity.class));
                  finish();
                  break;
              case R.id.card_car_getting_around:
                  startActivity(new Intent(ChooseCarPurposeActivity.this, ModelGettingAroundActivity.class));
                  finish();
                  break;
          }
    }
}
