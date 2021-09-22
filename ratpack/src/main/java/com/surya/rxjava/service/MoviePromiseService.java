package com.surya.rxjava.service;

import java.util.List;

import com.surya.model.Movie;

import ratpack.exec.Promise;

public interface MoviePromiseService {

    Promise<List<Movie>> getMovies();

    Promise<Movie> getMovie();

}
