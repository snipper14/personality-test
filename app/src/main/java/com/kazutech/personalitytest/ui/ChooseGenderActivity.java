package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ChooseGenderActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void initComponents(Bundle savedInstanceState) {

        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.button_male)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.button_female)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;


    }

    @Override
    protected int getLayout() {
        return R.layout.activity_choose_gender;
    }

    @Override
    public void onClick(View view) {

        int v=view.getId();

      /* AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
        view.startAnimation(buttonClick);
      */
        switch (v){
            case R.id.button_male:
                  startActivity(new Intent(ChooseGenderActivity.this,MaritalStatusActivity.class));
                  finish();
                break;
            case R.id.button_female:
                    startActivity(new Intent(ChooseGenderActivity.this,MaritalStatusActivity.class));
                    finish();
                    break;
            case R.id.img_back:
                startActivity(new Intent(ChooseGenderActivity.this,InitPlayActivity.class));
                finish();
                break;
        }

    }

    @Override
    public void onBackPressed() {
      startActivity(new Intent(ChooseGenderActivity.this,InitPlayActivity.class));
      finish();
    }
}
