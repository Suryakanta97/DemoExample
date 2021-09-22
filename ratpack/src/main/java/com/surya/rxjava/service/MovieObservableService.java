package com.surya.rxjava.service;

import com.surya.model.Movie;

import rx.Observable;

public interface MovieObservableService {

    Observable<Movie> getMovies();

    Observable<Movie> getMovie();

}
