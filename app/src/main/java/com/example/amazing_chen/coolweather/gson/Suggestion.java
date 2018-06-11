package com.example.amazing_chen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Amazing_Chen on 2018/6/4.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
      @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public  String info;
    }
}
