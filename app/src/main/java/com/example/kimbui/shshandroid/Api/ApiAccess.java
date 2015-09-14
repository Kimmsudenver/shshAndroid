package com.example.kimbui.shshandroid.Api;

import android.content.Context;

import com.example.kimbui.shshandroid.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by kimbui on 8/26/15.
 *
 * Calling shapeshift api for coin info , return json
 */
public class ApiAccess {

    private static HttpsURLConnection connection;
    private static Context mcontext;

    public ApiAccess(Context context){
        mcontext = context;
    }
    public static void  openConnection (URL url) {
        try {
            connection = (HttpsURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getCoinList() {
        String coinList =mcontext.getString(R.string.coinList);
        try {
            URL coinListPath = new URL(coinList);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(){
        if(connection!=null) connection.disconnect();

    }
}
