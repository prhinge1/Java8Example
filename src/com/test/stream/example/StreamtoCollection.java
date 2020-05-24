package com.test.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamtoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream=list.stream();
		
		List<Integer> evenList= stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

	}

}
