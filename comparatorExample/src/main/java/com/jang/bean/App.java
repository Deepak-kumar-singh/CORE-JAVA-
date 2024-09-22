package com.jang.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<MovieBean> list = App.getMovie();

		/*
		 * System.out.println("\nSorted by Rating"); Collections.sort(list, new
		 * CompareByRating());
		 * 
		 * for (MovieBean movie : list) System.out.println(movie.getYear() + " " +
		 * movie.getRating() + " " + movie.getName() + " ");
		 * 
		 * 
		 * list.stream().forEach(e->System.out.println(e));
		 * 
		 * 
		 */
		
		  Collections.sort(list, new CompareByName());
		List  l = list.stream().collect(Collectors.toList());
		System.out.print(l);
		
		
		
		
		
		

	}

	public static List<MovieBean> getMovie() {
		List<MovieBean> list = new ArrayList<>();
		MovieBean m = new MovieBean();
		m.setName("RAJA BHAI");
		m.setRating(150.6);
		m.setYear(2021);
		MovieBean m1 = new MovieBean();
		m1.setName("KANUN");
		m1.setRating(40.6);
		m1.setYear(2016);
		MovieBean m2 = new MovieBean();
		m2.setName("ABHILASHA");
		m2.setRating(6);
		m2.setYear(202);

		list.add(m);
		list.add(m1);
		list.add(m2);

		return list;

	}
}
