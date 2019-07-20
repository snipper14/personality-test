package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ChooseHomeActivity extends BaseActivity implements View.OnClickListener {


    private View[] viewArray;

    @Override
    protected void initComponents(Bundle savedInstanceState) {
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_apartment)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_villa)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_mansions)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.card_simpleflat)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);

       /* viewArray = new View[]{findViewById(R.id.card_apartment),  findViewById(R.id.img_back),findViewById(R.id.card_countryside_villa),
                findViewById(R.id.card_mansion), findViewById(R.id.card_simpleflat),
        };
        initClickView(viewArray);*/
    }

    private void initClickView(View[] view) {
        PushDownAnim.setPushDownAnimTo(view).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_choose_home;
    }

    @Override
    public void onClick(View view) {
        int v = view.getId();

        switch (v) {
            case R.id.img_back:
                loadClass(ChooseMealActivity.class);
                break;
            case R.id.card_apartment:
                loadClass(ChooseVacayActivity.class);
                break;

            case R.id.card_villa:
                loadClass(ChooseVacayActivity.class);
                break;

            case R.id.card_mansions:
                loadClass(ChooseVacayActivity.class);
                break;

            case R.id.card_simpleflat:
                loadClass(ChooseVacayActivity.class);
                break;


        }

    }

    private void loadClass(Class<?> classToLoad) {
        startActivity(new Intent(ChooseHomeActivity.this, classToLoad));
        finish();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ChooseHomeActivity.this, InitPlayActivity.class));
        finish();
    }
}
