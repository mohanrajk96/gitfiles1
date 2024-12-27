package collections;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "mohanraj krishnan";
		Set<Character> s1 = new HashSet<>();
		Set<Character> s2 = new HashSet<>();
		
		for (char rs : s.toCharArray()) {
			if (s1.add(rs)== false) {
				s2.add(rs);
			}
		}
		System.out.print("Repeated char:" +s2);
	}

}
