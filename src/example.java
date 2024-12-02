
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		//1221
		//amstrong
		int m =n, r=0,res=0;
		while (n >0)
		{
			r=n%10;
			res=res+r*r*r;
			n=n/10;
		}
		//System.out.println(res);
		if(res==m)
		{
			System.out.println(m+ " is armstrong");
		}
		else
			System.out.println(m+" is not amstrong");
}
}