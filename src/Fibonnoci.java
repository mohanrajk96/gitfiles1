import java.util.Scanner;

public class Fibonnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.print("enter no: ");
   int n= sc.nextInt();
   int a=0, b=1, s=0;
   System.out.print(+a+ " "+b +" ");  //0a 1b 1 2 3 5
   for ( int i=2; i<n; i++)
   {
	   s=a+b;
	   a=b;
	   b=s;
	   
	   System.out.print(s+ " ");
   }
	}

}
