package com.davis.qupy.responses;

import com.davis.qupy.models.TVShow;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowsResponse {
    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int totalPages;

    @SerializedName("ty_shows")
    private List<TVShow> tvShows;


    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<TVShow> getTvShows() {
        return tvShows;
    }
}
