package wanghaokang.android.gdei.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yixinyijin on 2017/7/18.
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
