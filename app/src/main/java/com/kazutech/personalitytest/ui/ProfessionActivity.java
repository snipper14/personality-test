package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ProfessionActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void initComponents(Bundle savedInstanceState) {

         PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_bussiness)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_employed)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_homegiver)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_profession;
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ProfessionActivity.this,InitPlayActivity.class));
        finish();
    }


    @Override
    public void onClick(View view) {

        int v=view.getId();

       /* AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
        view.startAnimation(buttonClick);
      */  switch (v){
            case R.id.card_bussiness:
                showToast("Business");
                startActivity(new Intent(ProfessionActivity.this,HolidayActivity.class));
                finish();
                break;
            case R.id.card_employed:
                showToast("Employed");
                startActivity(new Intent(ProfessionActivity.this,HolidayActivity.class));
                finish();
                break;
            case R.id.card_homegiver:
                showToast("Homegiver");
                startActivity(new Intent(ProfessionActivity.this,HolidayActivity.class));
                finish();
                break;
            case R.id.img_back:
                startActivity(new Intent(ProfessionActivity.this,MaritalStatusActivity.class));
                finish();
                break;
        }

    }
}
