package com.example.khoj;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Detectinterface {

    @GET("/fc/tags/save")
    Call<Savereceiver> savePosts(
            @Query("api_key") String api_key,
            @Query("api_secret") String api_secret,
            @Query("uid") String uid,
            @Query("tids") String tid

    );



}
