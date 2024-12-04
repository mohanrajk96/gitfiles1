import java.util.Scanner;

public class palindrome {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter No. ");
			int n = sc.nextInt();
			//int m =n;
			int a=0, res = 0;
			while(n>0)
			{
			a=n%10;  //3  5
			res=res*10+a; //27   152
			n=n/10;   //15
			//System.out.print("Ans. "+res);
			}
			System.out.print("Ans. "+res);
		}

	}
