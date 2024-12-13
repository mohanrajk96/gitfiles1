import java.util.HashSet;

public class StringRepeatArrayHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String arr[]	= {"java", "Python", "c++", "java"}; 
		 /*	boolean f= false;                               // Approach 1
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					f= true;
					System.out.println("Duplicate "+arr[i]);
				}
			}
		} if (f==true)
		{
			System.out.println("String Duplicate found");
		} else System.out.println("String Duplicate not found");  */
		
		// **************Approac 2  Hash Set*************** unique only
		
		HashSet<String>lang = new HashSet();
		boolean f = false;
		for(String l : arr)
		{
			if(lang.add(l)==false)
			{
				f= true;
				System.out.println("Duplicate "+l);
			}
		}
			if (f==false)
			{
				System.out.println("String Duplicate not found");
			} else System.out.println("String Duplicate found");
		}
			
		

	}

