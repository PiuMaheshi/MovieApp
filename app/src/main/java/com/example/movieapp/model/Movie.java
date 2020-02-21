package com.example.movieapp.model;

public class Movie {

    private static final long id = 1L;
    private String name;
    private String imdbid;

    public Movie() {
    }

    public static long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImdbid() {
        return imdbid;
    }

    public void setImdbid(String imdbid) {
        this.imdbid = imdbid;
    }
}
