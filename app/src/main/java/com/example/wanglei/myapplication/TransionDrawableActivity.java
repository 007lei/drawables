package com.example.wanglei.myapplication;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by wanglei on 2017/9/1.
 */

public class TransionDrawableActivity extends Activity {

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transiondrawable);
        imageView = (ImageView)findViewById(R.id.imageview);
        TransitionDrawable drawable = (TransitionDrawable) imageView.getBackground();
        drawable.startTransition(1000);
    }
}
