import java.util.Scanner;

public class StringFiles {

	//public static void m (String h)
	public static void main (String[] args)
	{
		String s = "GReh!23*&";
	//	Scanner reader = new Scanner(System.in);
		//char s = (char) reader.nextLine();
				int u=0, l=0, n=0, sp=0, t=0;
				//t=s.length();
				for (int i=0; i<s.length(); i++)
				{
				 char ch = s.charAt(i);
				 System.out.print(ch+",");
				 if ((ch>='A') && (ch<='Z'))
				 {
					 u++;
				 }
				 else if ((ch>='a') && (ch<='z'))
				 {
					 l++;
				 }
				 else if ((ch>='0') && (ch<='9'))
				 {
					 n++;
				 }
				 else
				 {
					 sp++;
				 }
				}
				System.out.println();
				System.out.println("Upper "+u);
				System.out.println("Lower "+l);
				System.out.println("Numbers "+n);
				System.out.println("SpecialCharcter "+sp);
	}
/*	public static void main (String[] args)
	{
		System.out.print("Enter: ");
		Scanner reader = new Scanner(System.in);
		char c = reader.nextLine);
	} */
}
