package com.example.amazing_chen.coolweather.gson;

/**
 * Created by Amazing_Chen on 2018/6/4.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
