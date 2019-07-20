package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ModelTransporterActivity extends BaseActivity implements View.OnClickListener {
    String[] mobileArray = {
            "\u2022 Comfortable seating for up to 11 passengers.",
            "\u2022 Safety systems like ABS,EBD,ESP.",
            "\u2022 Available in 4-motion 4 wheel drive.",
            "\u2022 Exceptional on road comfort and stability"};


    @Override
    protected void initComponents(Bundle savedInstanceState) {
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview,mobileArray);

        ListView listView = findViewById(R.id.tv_car_options_list);
        listView.setAdapter(adapter);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_transpoter_model;
    }

    @Override
    public void onClick(View view) {
        int v=view.getId();

        switch (v){
            case R.id.img_back:
            startActivity(new Intent(ModelTransporterActivity.this,ChooseCarPurposeActivity.class));
            finish();
        }

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(ModelTransporterActivity.this, InitPlayActivity.class));
        finish();
    }
}
