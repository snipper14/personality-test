package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class MaritalStatusActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void initComponents(Bundle savedInstanceState) {

        PushDownAnim.setPushDownAnimTo(findViewById(R.id.button_single)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.button_married)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;

     //   overridePendingTransition(R.anim.mainfadein,R.anim.splashfadeout);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_marital_status;
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MaritalStatusActivity.this,InitPlayActivity.class));
        finish();
    }

    @Override
    public void onClick(View view) {

        int v=view.getId();


        switch (v){
            case R.id.button_single:
                showToast("Single");
                startActivity(new Intent(MaritalStatusActivity.this,ProfessionActivity.class));
                finish();
                break;
            case R.id.button_married:
                showToast("Married");
                startActivity(new Intent(MaritalStatusActivity.this,ProfessionActivity.class));
                finish();
                break;
            case R.id.img_back:
                startActivity(new Intent(MaritalStatusActivity.this,ChooseGenderActivity.class));
                finish();
                break;
        }

    }
}
