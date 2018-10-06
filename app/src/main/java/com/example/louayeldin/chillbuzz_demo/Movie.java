package com.example.louayeldin.chillbuzz_demo;

public class Movie {

    private String movieName;
    private String movieDescription;
    private int movieRate;


    public Movie(String movieName, String movieDescription, int movieRate ) {
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.movieRate = movieRate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(int movieRate) {
        this.movieRate = movieRate;
    }
}// End of Class
