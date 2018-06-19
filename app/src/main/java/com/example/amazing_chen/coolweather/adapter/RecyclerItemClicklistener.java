package com.example.amazing_chen.coolweather.adapter;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Amazing_Chen on 2018/6/13.
 */

public class RecyclerItemClicklistener implements RecyclerView.OnItemTouchListener {

    private  RecyclerView touchView;
    private View childView;
    private  GestureDetectorCompat mGestureDetector;

    public RecyclerItemClicklistener(Context context, final RecyclerItemClicklistener.OnItemClickListener mListener){

        mGestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent e){
                if(childView != null && mListener != null){
                    mListener.onItemClick(childView,touchView.getChildPosition(childView)) ;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        childView = rv.findChildViewUnder(e.getX(), e.getY());
        touchView = rv;
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }

    public interface OnItemClickListener{
        void onItemClick(View view ,int position);
    }


}
