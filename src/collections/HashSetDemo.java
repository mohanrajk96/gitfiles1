package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String [] args) {
		HashSet hs = new HashSet();
		//Set hs = new HashSet();
		hs.add(100);
		hs.add(null);
		hs.add(true);
		hs.add('m');
		hs.add("mohan");   // insertion order  not preserved
		hs.add(100);
		hs.add('m');       //duplicate & multiple nulls not allowed only once
		
		System.out.println(hs.size());  //[null, 100, mohan, m, true]
		System.out.println(hs);
		
		//remove
		hs.remove('m');		
		System.out.println("Remove"); //remove using datas cant remove multiple value
		System.out.println(hs);
		
		//inseration element not posible
		//access specific element not possible but
		//we can *******convert hashset to arraylist************
		
		ArrayList alt = new ArrayList(hs);
		
		System.out.println("Converted into Array " + alt);
		System.out.println(alt.get(2));
		
		//can't use for loop
		
		for ( Object x : hs)
		{
			System.out.println(x);
		}
		
		Iterator itr = hs.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		hs.clear();
		System.out.println("Clear Executed" + hs);
		
	}

}
