import java.util.Arrays;

public class Check2ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { 5,4,3,9, 7, 8, 6,};
		int [] b= { 5,4,3,9, 7, 5, 6,};
		boolean s = Arrays.equals(a,b);     // 1st approach
		if(s==true)
		{
			System.out.println("Arrays are equal");
		}else System.out.println("Arrays are not equal");
		
		//2nd approach
		boolean s1 =true;
		if (a.length == b.length)
		{
			for(int i=0; i<a.length; i++) {
				if (a[i]!=b[i])
				{
				 s1=false;
				}
			}
		}
		else s1=false;
		if(s==true)
		{
			System.out.println("Arrays are equal");
		}else System.out.println("Arrays are not equal");
	}

}
