package com.hihasandesignpatterns.api;

import retrofit2.Retrofit;
//import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService
{
    public static Retrofit retrofit;

    public static Retrofit getRetrofitClient(){
        if (retrofit ==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BaseApi.BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }
}
