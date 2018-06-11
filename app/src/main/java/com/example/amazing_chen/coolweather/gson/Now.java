package com.example.amazing_chen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Amazing_Chen on 2018/6/4.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
