package com.example.michel.mydata2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by michel on 20/01/2018.
 */

public interface GithubService {
    @GET("svc/topstories/v2/home.json?api-key=c69e095eadba4c708c5d4ffeb0699a41")
    Call<List<GithubUser>> getFollowing(@Query("article")String title);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.nytimes.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
