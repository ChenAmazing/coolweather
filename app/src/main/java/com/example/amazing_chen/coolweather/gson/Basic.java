package com.example.amazing_chen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Amazing_Chen on 2018/6/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
