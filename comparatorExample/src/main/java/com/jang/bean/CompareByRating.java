package com.jang.bean;

import java.util.Comparator;

public class CompareByRating implements Comparator<MovieBean>{

	@Override
	public int compare(MovieBean o1, MovieBean o2) {
		if(o1.getRating() > o1.getRating())
		{
			return 	1;
		}
		 if(o1.getRating() < o2.getRating())
		{
			return -1;
		}
		return 0;
		
	}

}

