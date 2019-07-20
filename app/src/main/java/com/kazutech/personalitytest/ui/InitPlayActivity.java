package com.kazutech.personalitytest.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kazutech.personalitytest.MainActivity;
import com.kazutech.personalitytest.R;
import com.kazutech.personalitytest.base.BaseActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import static com.thekhaeng.pushdownanim.PushDownAnim.MODE_SCALE;

public class InitPlayActivity extends BaseActivity  implements View.OnClickListener {


    @Override
    protected void initComponents(Bundle savedInstanceState) {
       // findViewById(R.id.btn_play).setBackground(ContextCompat.getDrawable(InitPlayActivity.this,R.drawable.button_default));
        PushDownAnim.setPushDownAnimTo(findViewById(R.id.btn_play)).setScale( MODE_SCALE, 0.89f  ).setOnClickListener(this) ;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_init_play;
    }



    @Override
    public void onClick(View view) {
       int v=view.getId();
       switch (v){
           case R.id.btn_play:
           startActivity(new Intent(InitPlayActivity.this,ChooseGenderActivity.class));
           finish();
           break;
       }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                       Intent intent = new Intent(InitPlayActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                          finish();

                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
