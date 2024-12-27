package collections;

import java.util.HashSet;
import java.util.Set;

public class RepeatednumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 2, 4, 5, 6, 7, 5, 8, 5};
	      
	        
	        Set<Integer> seen = new HashSet<>();
	        Set<Integer> repeated = new HashSet<>();
	        
	        for (int num : arr) {
	           // if (!seen.add(num))      //1st approch
	            if(seen.add(num)==false)
	            {
	                repeated.add(num); // If add() returns false, the number is already in the set
	            }
	        }
	        
	        System.out.println("Repeated numbers: " + repeated);
	    }


	}

