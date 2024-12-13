import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.print("enter no: ");
		   int n= sc.nextInt();
		   
		   if ((n==2) || (n==3) || (n==5))
		   {
			   System.out.print(n+ " is prime");
		   }
		   else if ((n%2!=0) && (n%3!=0) && (n%5!=0))
			   {
				   System.out.print(n+ " is prime");
			   }
		   else System.out.print(n+ " is not prime");

	}

}
