package com.test.ln.getapitask;

import com.test.ln.getapitask.api.service.OkClientFactory;

import okhttp3.OkHttpClient;

/**
 * Created by ln-300 on 7/2/17.
 */

public class Application extends android.app.Application {

    private static Application mInstance = null;
    private static OkHttpClient mOkHttpClient;

    public static Application getInstance() {
        return mInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mOkHttpClient = OkClientFactory.provideOkHttpClient(this);
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }


}
