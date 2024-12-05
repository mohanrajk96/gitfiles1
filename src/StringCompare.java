import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First : ");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter Second : ");
		String s2 = sc.nextLine().toLowerCase();
		
		//for (int i=0; i<s1.length(); i++)
		//
		if((s1.length())==(s2.length()))
		{
			System.out.println("True");	
		}
		else
			System.out.println("False");

	}

}
