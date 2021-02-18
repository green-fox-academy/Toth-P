package com.example.weekzero.Retrofit;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class MainService {

    private static String BASE_URL = "https://api.themoviedb.org/3/";

    public MovieDTO getMovieById(Integer id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService movieRequest = retrofit.create(MovieService.class);
        Call<MovieDTO> call = movieRequest.getMovieByID(id, System.getenv("API_KEY"));
        MovieDTO movie = null;
        try {
            Response<MovieDTO> responseMovie = call.execute();
            movie = responseMovie.body();
        } catch (IOException e) {
            System.out.println("error with retrofit call");
        }
        return movie;
    }

    public TopRatedDTO getTopRated() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        TopRatedService topRatedRequest = retrofit.create(TopRatedService.class);
        Call<TopRatedDTO> call = topRatedRequest.getTopRated(System.getenv("API_KEY"));
        TopRatedDTO topRated = null;
        try {
            Response<TopRatedDTO> responseTopRated = call.execute();
            topRated = responseTopRated.body();
        } catch (IOException e) {
            System.out.println("error with retrofit topRated call");
        }
        return topRated;


    }

}