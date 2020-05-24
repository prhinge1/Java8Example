package com.test.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream <Integer> stream= Stream.of(1,2,3,4,5);
		stream.forEach(p -> System.out.println(p));
		
		System.out.println("******************************************************");
		System.out.println("Stream.of(arrayOfElements)");
		System.out.println("******************************************************");
		
		Stream <Integer> stream1= Stream.of(new Integer[]{3,4,5,6,7,8});
		stream1.forEach(p->System.out.println(p));
		
		/*
		 * System.out.println("******************************************************");
		 * System.out.println("Stream.generate() or Stream.iterate()");
		 * System.out.println("******************************************************");
		 */
		
		/*
		 * Stream<Date> stream2 = Stream.generate(() -> { return new Date(); });
		 * stream2.forEach(p -> System.out.println(p));
		 */
		System.out.println("******************************************************");
		System.out.println("            List.stream()                             ");
		System.out.println("******************************************************");
		  
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream3 = list.stream();
        stream3.forEach(p -> System.out.println(p));
	}

}
