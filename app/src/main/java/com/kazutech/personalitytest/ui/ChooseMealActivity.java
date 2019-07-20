package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ChooseMealActivity extends BaseActivity implements View.OnClickListener {



    @Override
    protected void initComponents(Bundle savedInstanceState) {
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_ugali_chama)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_burger_chips)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_githeri)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_sushi)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;

    }

    @Override
    protected int getLayout() {
        return     R.layout.activity_choose_meal ;

    }

    @Override
    public void onClick(View view) {


        int v=view.getId();
        switch (v){
            case R.id.img_back:
                loadClass(HolidayActivity.class);
                break;
            case R.id.img_ugali_chama:
                loadClass(ChooseHomeActivity.class);
                break;
            case R.id.img_burger_chips:
                loadClass(ChooseHomeActivity.class);
                break;
            case R.id.img_githeri:
                loadClass(ChooseHomeActivity.class);
                break;
            case R.id.img_sushi:
                loadClass(ChooseHomeActivity.class);
                break;

        }

    }

    private void loadClass(Class classToLoad) {
        startActivity(new Intent(ChooseMealActivity.this,classToLoad));
        finish();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ChooseMealActivity.this,InitPlayActivity.class));
        finish();
    }
}
