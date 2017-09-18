package com.example.wanglei.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by wanglei on 2017/9/1.
 */

public class LayerDrawableActivity  extends Activity{

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layerdrawable);
        imageView = (ImageView) findViewById(R.id.imageview);
        imageView.setBackground(getResources().getDrawable(R.drawable.layerdrawable2));
    }
}
