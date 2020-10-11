package com.example.Collections2;

public class MovieDetails {
	private String movName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	public MovieDetails(String movDetails, String leadActor, String leadActress, String genre) {
		super();
		this.movName = movDetails;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}
	public String getMovName() {
		return movName;
	}
	public void setMovName(String movName) {
		this.movName = movName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
