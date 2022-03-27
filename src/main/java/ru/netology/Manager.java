package ru.netology;

public class Manager {
    private Moviesdatas[] movies = new Moviesdatas[0];
    private int lastMovies = 10;

    public Manager() {
    }

    public Manager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public void add(Moviesdatas movie) {
        int length = movies.length + 1;
        Moviesdatas[] tmp = new Moviesdatas[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Moviesdatas[] findAll() {
        return this.movies;
    }

    public Moviesdatas[] findMaxLast() {
        int resultlength = Math.min(movies.length, lastMovies);
        Moviesdatas[] result = new Moviesdatas[resultlength];
        for (int i = 0; i < resultlength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}
