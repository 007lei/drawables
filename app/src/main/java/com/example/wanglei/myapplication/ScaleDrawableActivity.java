package com.example.wanglei.myapplication;

import android.app.Activity;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by wanglei on 2017/9/1.
 */

public class ScaleDrawableActivity extends Activity implements View.OnClickListener{

    private ImageView imageview;
    private Button bt1,bt2,bt3,bt4;
    private ScaleDrawable drawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scaledrawable);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

        imageview = (ImageView) findViewById(R.id.imgView);
        drawable = (ScaleDrawable) imageview.getDrawable();
        drawable.setLevel(1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                drawable.setLevel(1);
                break;
            case R.id.bt2:
                drawable.setLevel(1000);
                break;
            case R.id.bt3:
                drawable.setLevel(5000);
                break;
            case R.id.bt4:
                drawable.setLevel(10000);
                break;
        }
    }
}
