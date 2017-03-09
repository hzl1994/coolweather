package com.coolweather.android.gson;

/**
 * Created by 黄智龙 on 2017/3/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
