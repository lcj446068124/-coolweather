package com.example.lcj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lcj on 2018/2/19.
 */

public class Basic {

    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
