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
    @GET("svc/{username}/v2/home.json?api-key={api_key}")
    Call<List<GithubUser>> getFollowing(@Path("username") String username, @Query("api-key")String apikey);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.nytimes.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
