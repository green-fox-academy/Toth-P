package com.example.weekzero.Retrofit;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    private Integer id;
    @SerializedName("imdb_id")
    private String imdbId;
    private String originalTitle;
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    private Integer runtime;
    private String status;
    private String title;
    private List<Genre> genres = null;

}
