package com.example.weijunhao.click;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_UP;

/**
 * Created by WEI JUNHAO on 2017/5/16.
 */

public class ClickView extends android.support.v7.widget.AppCompatButton {
    public ClickView(Context context) {
        super(context);
    }

    public ClickView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ClickView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    private void init() {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                Log.d("wjh", "view onTouchEvent: move");
                break;
            case ACTION_DOWN:
                Log.d("wjh", "view onTouchEvent: down");
                break;
            case ACTION_UP:
                Log.d("wjh", "view onTouchEvent: up");
                break;
        }
        return super.onTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("wjh", "view dispatchTouchEvent: " + event.getAction());
        return super.dispatchTouchEvent(event);
        //return true;
    }
}
