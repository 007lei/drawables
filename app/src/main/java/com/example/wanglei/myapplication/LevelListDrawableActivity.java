package com.example.wanglei.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by wanglei on 2017/9/1.
 */

public class LevelListDrawableActivity extends Activity {

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levellistdrawable);
        imageView = (ImageView) findViewById(R.id.imageview);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.levellistdrawable));//设置
        imageView.setImageLevel(0);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageView.getDrawable().getLevel() == 0 ){
                    imageView.setImageLevel(1);
                }else {
                    imageView.setImageLevel(0);
                }
            }
        });
    }
}
