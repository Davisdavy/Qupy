package com.davis.qupy.network;

import com.davis.qupy.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("most_popular")
    Call<TVShowsResponse> getMostPopularTVShows(@Query("page") int page);
}
