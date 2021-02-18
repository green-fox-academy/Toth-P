package com.example.weekzero.Retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface TopRatedService {

    @GET("movie/top_rated")
    Call<TopRatedDTO> getTopRated(@Query("api_key") String api_key);
}
