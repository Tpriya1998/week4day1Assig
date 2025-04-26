package week4.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7} ;
		int [] num2= {1,2,8,4,9,7};
		
		int lengthOfNum = num.length;
		System.out.println("The length of num:"+lengthOfNum);
		
		int lengthOfNum2 = num2.length;
		System.out.println("The length of num2:" +lengthOfNum2);
		
		for (int i =1;i<num.length;i++) {
			for (int j =1;i<num2.length;j++) {
				if(num[i]!=num2[j]) {
			System.out.println("Equal found");
				}
				else {
					System.out.println("Equal not found");
				}
			}
		
		

			
		}
		
			
		}
		
	}

