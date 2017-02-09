package com.test.ln.getapitask.api.service;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.compat.BuildConfig;


import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkClientFactory {
    // Cache size for the OkHttpClient

    private static final int DISK_CACHE_SIZE = 50 * 1024 * 1024; // 50MB
    private static final int OKHTTP_TIMEOUT = 60; // seconds

    private OkClientFactory() {
    }

    @NonNull
    public static OkHttpClient provideOkHttpClient(Application app) {
        // Install an HTTP cache in the application cache directory.
        File cacheDir = new File(app.getCacheDir(), "http");
        Cache cache = new Cache(cacheDir, DISK_CACHE_SIZE);
        OkHttpClient.Builder builder;

        builder = new OkHttpClient.Builder()
                .connectTimeout(OKHTTP_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(OKHTTP_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(OKHTTP_TIMEOUT, TimeUnit.SECONDS)
                .cache(cache);
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(loggingInterceptor);
        }
        return builder.build();
    }
}
