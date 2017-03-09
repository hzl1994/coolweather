package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 黄智龙 on 2017/3/9.
 */

public class Basic {
    @SerializedName("city")
    public String cityName; //城市名

    @SerializedName("id")
    public String weatherId;    //天气ID

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;   //更新时间  2017-3-9 13:28
    }
}
