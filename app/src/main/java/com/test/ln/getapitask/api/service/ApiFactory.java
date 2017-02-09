package com.test.ln.getapitask.api.service;

import android.support.annotation.NonNull;


import com.test.ln.getapitask.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiFactory {

    private static final String API_BASE_URL = "http://maps.googleapis.com/maps/api/geocode/";  // demo server

    private ApiFactory() {
    }

    @NonNull
    private static Retrofit provideRestAdapter() {
        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //.client(Application.getInstance().getOkHttpClient())
                .build();
    }

    public static <S> S createService(Class<S> serviceClass) {
        return provideRestAdapter().create(serviceClass);
    }

}
