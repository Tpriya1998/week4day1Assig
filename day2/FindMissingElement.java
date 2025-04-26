package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.analysis.function.Add;

public class FindMissingElement {
	//1,2,3,4,10,6,8

	public static void main(String[] args) {
		List<Integer> element = new ArrayList <Integer>();
		System.out.println("The list is : "  );
		
		element.add(1);
		System.out.println("The List after adding 1 data"+element);
		
		element.add(2);
		System.out.println("The List after adding 2 data"+element);
		
		element.add(3);
		System.out.println("The List after adding 3 data"+element);
		
		element.add(4);
		System.out.println("The List after adding 4 data"+element);
		
		element.add(10);
		System.out.println("The List after adding 5 data"+element);
		
		element.add(6);
		System.out.println("The List after adding 6 data"+element);
		
		element.add(8);
		System.out.println("The List after adding 7 data"+element);
		
	     Collections.sort(element);
	     System.out.println("After arranging in the ascending order:"+element);
	     
	     
	     
	     Integer dataAtCurrent = element.get(0);
	     
	     for(int i =0; i != dataAtCurrent+1; i ++) {
	    	 if(i!=dataAtCurrent+1) {
	    		 element.get(i);
		    	 
	    		 System.out.println("Gap in sequence =" +element);
	   
	    	 }
	    	 else {
	    		 System.out.println("Check the gap is not  in sequence"+element);
	    	 }
	    	 
	    	
	     }
	    
	}

}
