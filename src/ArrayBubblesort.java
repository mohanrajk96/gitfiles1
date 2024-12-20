import java.util.Arrays;
import java.util.Collections;

public class ArrayBubblesort {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int a[] = { 5, 8,9,2,4}; int t;
		System.out.println("Array before sort : " + Arrays.toString(a));
		
		for (int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				t=0;
				if (a[j]>a[j+1])//3 2
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Array after sort : " + Arrays.toString(a)); 
		
		//***********************	
				int b[] = { 5, 8,9,2,4};
				Arrays.parallelSort(b);                // buildin methods
				System.out.println ("buildin method: " + Arrays.toString(b)); // buildin methods
				
				Arrays.sort(b);                // just sort methods
				System.out.println ("ascending: " + Arrays.toString(b));
				
				Integer b1[] = {50,20,60,80,90};
				Arrays.sort(b1, Collections.reverseOrder());                // decending methods
				System.out.println ("decending: " + Arrays.toString(b1));
				//********************************

	}

}
