package wanghaokang.android.gdei.weathertest.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yixinyijin on 2017/7/18.
 */

public class Weather
{
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
