import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String s = "Mohan raj";  9
			//StringBuilder s1 = new StringBuilder(s);
		System.out.println("Enter String :");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			int c=1;
			for (int i=0; i<s.length(); i++) 
			{
				
				if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) 
				{
					c++;
				}
				
			}
	System.out.println("words :" + c );			
	}
}
