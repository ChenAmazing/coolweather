package com.example.amazing_chen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Amazing_Chen on 2018/5/29.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private  String weatherId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
