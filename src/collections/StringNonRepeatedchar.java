package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringNonRepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "mohanraj krishnan";
		Set<Character> s1 = new LinkedHashSet<>();
		Set<Character> s2 = new LinkedHashSet<>();
		
		for (char rs : s.toCharArray()) {
			if (s1.add(rs)== false) {
				s2.add(rs);
			}
		}
		s1.remove(' ');
		s1.removeAll(s2);
		System.out.print("Repeated char:" +s1);
	}

	}

