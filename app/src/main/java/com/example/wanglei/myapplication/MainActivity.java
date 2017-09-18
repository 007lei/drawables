package com.example.wanglei.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    private ListView lv;
    private DrawableAdapter drawableAdapter;
    private List<String> drawables = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        drawables.add("AnimatedVectorDrawable");//0
        drawables.add("BitmapDrawable");//1
        drawables.add("ClipDrawabe");//2
        drawables.add("ColorDrawable");//3
        drawables.add("DrawableContainer");//4
        drawables.add("DrawableContainer_AnimationDrawable");//5
        drawables.add("DrawableContainer_LevelListDrawable");//6
        drawables.add("DrawableContainer_StateListDrawable");//7
        drawables.add("DrawableContainer_StateListDrawable_AnimatedStateListDrawable");//8
        drawables.add("GradientDrawable");//9
        drawables.add("InsertDrawable");//10
        drawables.add("InsertDrawable_SlideDrawable");//11
        drawables.add("LayerDrawable");//12
        drawables.add("LayerDrawable_RippleDrawable");//13
        drawables.add("LayerDrawable_TransionDrawable");//14
        drawables.add("NinePatchDrawable");//15
        drawables.add("PictureDrawable");//16
        drawables.add("RotateDrawable");//17
        drawables.add("ScaleDrawable");//18
        drawables.add("ShapeDrawable");//19
        drawables.add("ShapeDrawable_paintDrawable");//20
        drawables.add("VectorDrawable");//21
        drawableAdapter = new DrawableAdapter(this,drawables);
        lv.setAdapter(drawableAdapter);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                //AnimatedVectorDrawable
                break;
            case 1:
                //BitmapDrawable
                Intent intent1 = new Intent(MainActivity.this, BitmapDrawableActivity.class);
                startActivity(intent1);
                break;
            case 2:
                //ClipDrawabe
                Intent intent2 = new Intent(MainActivity.this, ClipDrawableActivity.class);
                startActivity(intent2);
                break;
            case 3:
                //ColorDrawable
                break;
            case 4:
                //AnimatedVectorDrawable
                break;
            case 5:
                //AnimatedVectorDrawable
                break;
            case 6:
                //LevelListDrawable
                Intent intent6 = new Intent(MainActivity.this, LevelListDrawableActivity.class);
                startActivity(intent6);
                break;
            case 7:
                //StateListDrawable
                Intent intent7 = new Intent(MainActivity.this, StateListDrawableActivity.class);
                startActivity(intent7);
                break;
            case 10:
                //InsertDrawable
                Intent intent10 = new Intent(MainActivity.this, InsetDrawableActivity.class);
                startActivity(intent10);
                break;
            case 11:
                //AnimatedVectorDrawable
                break;
            case 12:
                //LayerDrawable
                Intent intent12 = new Intent(MainActivity.this, LayerDrawableActivity.class);
                startActivity(intent12);
                break;
            case 13:
                //AnimatedVectorDrawable
                break;
            case 14:
                //TransionDrawable
                Intent intent14 = new Intent(MainActivity.this, TransionDrawableActivity.class);
                startActivity(intent14);
                break;
            case 15:
                //AnimatedVectorDrawable
                break;
            case 16:
                //AnimatedVectorDrawable
                break;
            case 17:
                //AnimatedVectorDrawable
                break;
            case 18:
                //ScaleDrawable
                Intent intent18 = new Intent(MainActivity.this, ScaleDrawableActivity.class);
                startActivity(intent18);
                break;
            case 19:
                //ShapeDrawable
                Intent intent19 = new Intent(MainActivity.this, ShapeDrawableActivity.class);
                startActivity(intent19);
                break;
            case 20:
                //AnimatedVectorDrawable
                break;
            case 21:
                //AnimatedVectorDrawable
                break;

        }

    }
}
