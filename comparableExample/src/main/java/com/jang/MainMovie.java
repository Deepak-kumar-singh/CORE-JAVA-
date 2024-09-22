package com.jang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class MainMovie 
{
	
    public static void main( String[] args )
    {
    	List<MovieBean> list = MainMovie.getMovie();
    			{
    Collections.sort(list);
	/*
	 * List s = list.stream().collect(Collectors.toList());
	 * 
	 * System.out.println(s);
	 */
    	
    	for(MovieBean ss:list)
    	{
    		System.out.println(ss.getRating()+" ===="+ss.getName()+" ===="+ss.getYear());
    	}
    	
    	
    	
    	
    				
    			}
    }
    
    public static List<MovieBean> getMovie( )
    {
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
