package com.example.whitepaw.mytopspotifytracks;

/**
 * Created by Whitepaw on 05/07/2017.
 */

public class Song {

    private int ranking;
    private String title;
    private String url;

    public Song(Integer ranking, String title, String url) {
        this.ranking = ranking;
        this.title = title;
        this.url = url;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

}

