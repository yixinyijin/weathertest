package wanghaokang.android.gdei.weathertest.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yixinyijin on 2017/7/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
