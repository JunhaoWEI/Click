package com.example.weijunhao.click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_UP;

public class MainActivity extends AppCompatActivity {

    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView = findViewById(R.id.clivk_view);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("wjh", "Activity dispatchTouchEvent: " + ev.getAction());
        return super.dispatchTouchEvent(ev);
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                Log.d("wjh", "Activity onTouchEvent: move");
                break;
            case ACTION_DOWN:
                Log.d("wjh", "Activity onTouchEvent: down");
                break;
            case ACTION_UP:
                Log.d("wjh", "Activity onTouchEvent: up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
