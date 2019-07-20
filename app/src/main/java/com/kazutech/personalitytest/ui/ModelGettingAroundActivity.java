package com.kazutech.personalitytest.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class ModelGettingAroundActivity extends BaseActivity implements View.OnClickListener {
    String[] modelFeaturesArray = {
            "\u2022 Premium mid-size SUV.",
            "\u2022 Sleek and stylish new look.",
            "\u2022 Available in either 5 or 7 seater(All space version).",
            "\u2022 Powerful engine, 7 speed DSG gearbox and -motion  all wheel drive.",
            "\u2022 Usual VW safety systems like ABS,EBD,ESP"
    };

    @Override
    protected void initComponents(Bundle savedInstanceState) {
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, modelFeaturesArray);

        ListView listView = findViewById(R.id.tv_car_options_list);
        listView.setAdapter(adapter);
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.img_back)).setScale(MODE_SCALE, 0.89f).setOnClickListener(this);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_model_getting_around;
    }

    @Override
    public void onClick(View view) {
        int v=view.getId();

        switch (v)
        {
            case R.id. img_back:
                startActivity(new Intent(ModelGettingAroundActivity.this,ChooseCarPurposeActivity.class));
                finish();
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ModelGettingAroundActivity.this, InitPlayActivity.class));
        finish();
    }
}
