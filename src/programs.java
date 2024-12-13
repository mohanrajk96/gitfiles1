public class programs {

	public static void main(String[] args)
	{
		int [] a= { 5,4,3,5};
		int s =0, c=0;
		for (int i=0; i<a.length; i++)  //1st method
		{
			s=s+a[i];
		}
		System.out.println("1st method " + s);
		
		for (int v:a) //2nd method for each
		{
			c=c+v;
		} 	System.out.println("2nd method " + c);
	}	
	
}
