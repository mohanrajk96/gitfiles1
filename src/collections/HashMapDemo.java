package collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// key & value type declare
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Key  is unique but value duplicate allowed
		// insertion order  not preserved
		
		hm.put(101, "mohan");
		hm.put(102, "babu");
		hm.put(103, "k");
		hm.put(102, "raj");
		hm.put(104, "fnffj");
		
		System.out.println(hm); //{101=mohan, 102=raj, 103=k, 104=fnffj}
		
		// remove
		hm.remove(104);
		System.out.println(hm); //{101=mohan, 102=raj, 103=k}
		
		// access value
		System.out.println(hm.get(102));  //raj
		
		//get all keys 
		System.out.println(hm.keySet());  //[101, 102, 103]
		
		//get all value 
		System.out.println(hm.values()); //[mohan, raj, k]
		
		System.out.println(hm.entrySet());
		
		//read datas from hashmap
		
		for(Object k :hm.keySet() )  // we can use int instead of object
		{
			System.out.println(k + " " + hm.get(k));
		}
		
		//using Iterator
		
		Iterator <Entry<Integer, String>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		
		
		
	}

}
