package com.example.lcj.coolweather.gson;

/**
 * Created by lcj on 2018/2/19.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
