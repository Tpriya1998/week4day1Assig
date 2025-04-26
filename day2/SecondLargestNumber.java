package week4.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// {3,2,11,4,6,7};	  
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("The list is : " );
		
		numbers.add(3);
		System.out.println("List after adding 1 data:" +numbers);
		numbers.add(2);
		System.out.println("List after adding 2 data:"+numbers);
		numbers.add(11);
		System.out.println("List after adding 3 data:"+numbers);
		numbers.add(4);
		System.out.println("List after adding 4 data:"+numbers);
		
		numbers.add(6);
		System.out.println("List after adding 5 data:"+numbers);
		numbers.add(7);
		System.out.println("List after adding 6 data:"+numbers);
		
		int sizeOfList = numbers.size();
		System.out.println("The List size is :"+sizeOfList);
		//Arrange the numbers in ascending order
		System.out.println("------");
		
		Collections.sort(numbers);
		System.out.println("List after sorting  data:"+numbers);
		
		
		Integer dataAtIndex3 = numbers.get(4);
		System.out.println("Second largest number is :"+(dataAtIndex3));
		
		
		
		

		
		
		
	}

}
