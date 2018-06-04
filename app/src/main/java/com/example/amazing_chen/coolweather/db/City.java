package com.example.amazing_chen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Amazing_Chen on 2018/5/29.
 */

public class City extends DataSupport {
    private int id;
    private String ctiyName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public String getCtiyName() {
        return ctiyName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCtiyName(String ctiyName) {
        this.ctiyName = ctiyName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
