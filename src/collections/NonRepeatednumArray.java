package collections;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatednumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 5, 6, 7, 5, 8, 5};
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int n : arr) {
			if (s1.add(n)==false) {
				s2.add(n);
			}
		}
		s1.removeAll(s2);
		System.out.print("NonRepeated :" +s1);
	}

}
