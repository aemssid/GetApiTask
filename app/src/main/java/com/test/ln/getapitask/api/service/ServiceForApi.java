package com.test.ln.getapitask.api.service;

import com.test.ln.getapitask.api.response.GetApiRes1;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ln-300 on 8/2/17.
 */

public interface ServiceForApi {

    @GET("json?address=3rd&amp;Lindsley&sensor=false")
    Call<GetApiRes1> getResponse();

}
