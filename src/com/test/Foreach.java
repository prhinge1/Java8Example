package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alex", "Brian", "Charles");
		
		Consumer<String> makeUpperCase = new Consumer<String>()
		{
		    @Override
		    public void accept(String t) 
		    {
		        System.out.println(t.toUpperCase());
		    }
		};
		 
		names.forEach(makeUpperCase); 
	    
		System.out.println("***********************************************************************");
		
		names.forEach(System.out::println);
		
		System.out.println("***********************************************************************");
		
		Map<String, String> map = new HashMap<String, String>();
		 
		map.put("A", "Alex");
		map.put("B", "Brian");
		map.put("C", "Charles");
		 
		map.forEach((k, v) -> 
		    System.out.println("Key = " + k + ", Value = " + v));

	}

}
