package com.jang.bean;

import java.util.Comparator;

public class CompareByName implements Comparator<MovieBean>{

	@Override
	public int compare(MovieBean obj1, MovieBean obj2) {
		
		return obj1.getName().compareTo(obj2.getName());
		
	}

}

