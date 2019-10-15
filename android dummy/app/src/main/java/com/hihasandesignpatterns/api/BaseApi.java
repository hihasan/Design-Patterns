package com.hihasandesignpatterns.api;

import com.hihasandesignpatterns.model.MainModel;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BaseApi
{
    public static String BaseUrl="https://www.simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<MainModel>> getHeros();
}
