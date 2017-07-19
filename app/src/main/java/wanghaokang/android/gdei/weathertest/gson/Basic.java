package wanghaokang.android.gdei.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yixinyijin on 2017/7/18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
