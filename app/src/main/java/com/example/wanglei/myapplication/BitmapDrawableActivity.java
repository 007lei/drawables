package com.example.wanglei.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by wanglei on 2017/9/1.
 */

public class BitmapDrawableActivity extends Activity implements View.OnClickListener{

    private Button bt1,bt2,bt3,bt4;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmapdrawable);
        imageView = (ImageView) findViewById(R.id.image1);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                imageView.setBackground(getResources().getDrawable(R.drawable.bitmapdrawable));
                break;
            case R.id.bt2:
                imageView.setBackground(getResources().getDrawable(R.drawable.bitmapdrawable_clamp));
                break;
            case R.id.bt3:
                imageView.setBackground(getResources().getDrawable(R.drawable.bitmapdrawable_repeat));
                break;
            case R.id.bt4:
                imageView.setBackground(getResources().getDrawable(R.drawable.bitmapdrawable_mirror));
                break;
        }
    }
}
