package ru.netology.manager;

import ru.netology.domain.MoviesDatas;

public class Manager {
    private MoviesDatas[] movies = new MoviesDatas[0];
    private int lastMovies = 10;



    public Manager() {
    }

    public Manager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public void add(MoviesDatas movie) {
        int length = movies.length + 1;
        MoviesDatas[] tmp = new MoviesDatas[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MoviesDatas[] findAll() {
        return this.movies;
    }

    public MoviesDatas[] findMaxLast() {
        int resultlength = Math.min(movies.length, lastMovies);
        MoviesDatas[] result = new MoviesDatas[resultlength];
        for (int i = 0; i < resultlength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}
