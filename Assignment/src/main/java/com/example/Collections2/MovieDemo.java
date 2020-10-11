package com.example.Collections2;

import java.util.ArrayList;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDetails md1 = new MovieDetails("Avengers","chris","natalia","rock");
		MovieDetails md2 = new MovieDetails("hello","henry","carla","blues");
		MovieDetails md3 = new MovieDetails("legend","nick","martina","jazz");
		MovieDetails md4 = new MovieDetails("Demolition","rock","martina","rhythm");
		
		MovieDetailsList mdl = new MovieDetailsList();
		mdl.addMovie(md1);
		mdl.addMovie(md2);
		mdl.addMovie(md3);
		mdl.addMovie(md4);
		System.out.println("List after adding movie");
		mdl.showList();
		
		mdl.removeMovie(new MovieDetails("hello","henry","carla","blues"));
		System.out.println("List after deleting movie");
		mdl.showList();
		
		ArrayList<MovieDetails> resultList;
		resultList = mdl.findMovieByMovieName("legend");
		System.out.println("searched movies by name:");
		resultList.forEach(m -> System.out.println(m.getMovName()+", "+m.getLeadActor()+", "+m.getLeadActress()+", "+m.getGenre()));
		
		resultList = mdl.findMovieByGenre("rock");
		System.out.println("searched movies by genre:");
		resultList.forEach(m -> System.out.println(m.getMovName()+", "+m.getLeadActor()+", "+m.getLeadActress()+", "+m.getGenre()));
		
		mdl.sortByValue("name");
		System.out.println("sorted list by movie name");
		mdl.showList();
		
		mdl.removeAllMovies();
		System.out.println("List after deleting all movie");
		mdl.showList();
	}

}
