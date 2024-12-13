import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no: ");
		   int n= sc.nextInt();
		   System.out.print("2"+ " "+ "3" + " ");
		   for( int i=4; i<=n; i++)
		   {
			   if ((i%2!=0) && (i%3!=0) && (i%5!=0))
			   {
				   System.out.print(i+ " ");
			   }
				  
		   }

	}

}
