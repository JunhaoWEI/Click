package com.example.weijunhao.click;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_UP;

/**
 * Created by WEI JUNHAO on 2017/5/16.
 */

public class CustomViewGroup extends LinearLayout {
    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("wjh", "ViewGroup dispatchTouchEvent: " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    /**
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("wjh", "ViewGroup onInterceptTouchEvent: " + ev.getAction());
        return super.onInterceptTouchEvent(ev);
        //return true;
    }

    /**
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                Log.d("wjh", "ViewGroup onTouchEvent: move");
                break;
            case ACTION_DOWN:
                Log.d("wjh", "ViewGroup onTouchEvent: down");
                break;
            case ACTION_UP:
                Log.d("wjh", "ViewGroup onTouchEvent: up");
                break;
        }
        return super.onTouchEvent(event);
        //return true;
    }
}
