package com.example.lcj.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lcj on 2018/2/19.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
