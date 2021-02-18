package com.example.weekzero.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieService {

    @GET("movie/{id}")
    Call<MovieDTO> getMovieByID(@Path("id") Integer id, @Query("api_key") String api_key);

}
