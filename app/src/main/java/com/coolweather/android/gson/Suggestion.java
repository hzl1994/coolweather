package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 黄智龙 on 2017/3/9.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort; //舒适度

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport; //运动情况

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
        public String info;

    }

}
