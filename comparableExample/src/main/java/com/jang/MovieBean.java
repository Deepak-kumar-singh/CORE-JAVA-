package com.jang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MovieBean implements Comparable<MovieBean>{
	
	private double rating;
	private String name;
	private int year;
	
	@Override
	public String toString() {
		return "MovieBean [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	public MovieBean(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
    public MovieBean() {
		super();
		// TODO Auto-generated constructor stub
	}





	public double getRating() {
		return rating;
	}





	public void setRating(double rating) {
		this.rating = rating;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	@Override
	public int compareTo(MovieBean bean) 
	{
		return this.year-bean.year;
	}
	
	


	

}
