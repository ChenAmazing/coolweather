package com.example.amazing_chen.coolweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;


public class FutureActivity extends AppCompatActivity {
    private LineChart mChart;
    private LineDataSet dataSet;
    private LineData data;
    private ArrayList<String> xVals;
    private ArrayList<Entry> yVals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        Intent intent = getIntent();
        ArrayList<String> dateList = intent.getStringArrayListExtra("date");
        ArrayList<String> maxList = intent.getStringArrayListExtra("max");
        ArrayList<String> minList = intent.getStringArrayListExtra("min");
        mChart = (LineChart) findViewById(R.id.chart);
        xVals = new ArrayList<>();
        yVals = new ArrayList<>();
        for(int i =0;i<dateList.size();i++){
            float max = Float.parseFloat(maxList.get(i));
            float min = Float.parseFloat(minList.get(i));
            float tmp = (max + min)/2;
            yVals.add(new Entry(tmp,i));
            String s = dateList.get(i);
            xVals.add(s);
        }
        YAxis ya =mChart.getAxisLeft();
        ya.setStartAtZero(false);
        dataSet = new LineDataSet(yVals, "温度/°C");
        data = new LineData(xVals, dataSet);
        mChart.setData(data);
        mChart.setScaleEnabled(false);
        mChart.setDescription("未来7天天气预报");
        mChart.animateY(3000);

    }
}
