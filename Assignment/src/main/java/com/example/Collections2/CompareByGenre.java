package com.example.Collections2;

import java.util.Comparator;

public class CompareByGenre implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails obj1, MovieDetails obj2) {
		// TODO Auto-generated method stub
		return obj1.getGenre().compareTo(obj2.getGenre());
	
	}
	
}
