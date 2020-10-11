package com.example.Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MovieDetailsList{
	private ArrayList<MovieDetails> movieList = new ArrayList<>();

	public void addMovie(MovieDetails movie) {
		movieList.add(movie);
	}
	public void removeMovie(MovieDetails movie) {
		for(int i=0; i<movieList.size(); i++) {
			MovieDetails temp = movieList.get(i);
			if(temp.getMovName()==movie.getMovName() && temp.getLeadActor()==movie.getLeadActor() && temp.getLeadActress()==movie.getLeadActress() && temp.getGenre()==movie.getGenre()) {
				movieList.remove(i);
			}
		}
	}
	public void removeAllMovies()
	{
		movieList.clear();
	} 
	public ArrayList<MovieDetails> findMovieByMovieName(String movName) {
		ArrayList<MovieDetails> searchList = (ArrayList<MovieDetails>) movieList.stream().filter(m -> m.getMovName() == movName).collect(Collectors.toList());
		return searchList;
	}
	public ArrayList<MovieDetails> findMovieByGenre(String genre) {
		ArrayList<MovieDetails> searchList = (ArrayList<MovieDetails>) movieList.stream().filter(m -> m.getGenre() == genre).collect(Collectors.toList());
		return searchList;
	}
	public void showList() {
		if(!movieList.isEmpty()) {
			for(MovieDetails it : movieList) {
				System.out.println(it.getMovName()+", "+it.getLeadActor()+", "+it.getLeadActress()+", "+it.getGenre());
			}
		}
		else {
			System.out.println("Empty list");
		}
		
	}
	public void sortByValue(String val) {
		if(val.toLowerCase()=="name") {
			Collections.sort(movieList,new CompareByName());;
		}
		else if(val.toLowerCase()=="genre") {
			Collections.sort(movieList,new CompareByGenre());
		}
	}
}
