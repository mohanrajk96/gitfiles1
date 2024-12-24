package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list al = new ArrayList();
		//ArrayList <String>all = new ArrayList<String>();
		ArrayList al = new ArrayList();
		al.add(100);  //add datas
		al.add('m');              //Insertion order preserved
		al.add("mohan");          //duplicates allowed
		al.add(100);                // multiple null allowed
		al.add(true);
		al.add(null);
		System.out.println("Size : " + al.size());	 //size starts with 1 2 3
		System.out.println("Datas : "+ al);
		
		//Remove
		al.remove(3);
		System.out.println("Remove");
		System.out.println("Size : " + al.size());
		System.out.println("Datas : "+ al);
		
		//Insert
		al.add(4,100.5);
		System.out.println("Insert");
		System.out.println("Size : " + al.size());
		System.out.println("Datas : "+ al);
		
		//modify
		al.set(1, 's');
		System.out.println("modify");
		System.out.println("Size : " + al.size());
		System.out.println("Datas : "+ al);
		
		//Access specific elements from arrayList
		System.out.println("Access specific elements from arrayList");
		System.out.println(al.get(2));
		
		//al.clear() will delete all elements
		//remove multiple elements 
		ArrayList al2 = new ArrayList();
		al2.add('m');
		al2.add(100);
		al2.add(null);
		
		al.removeAll(al2);
		
		System.out.println( "remove multiple elements");
		System.out.println("Size : " + al.size());
		System.out.println("Datas : "+ al);
		
		/*for(int i=0;i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}*/
		
	/*	for (Object x : al)
		{
			System.out.println(x);
		} */
		
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
