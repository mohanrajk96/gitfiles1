import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String or = "#Raj";
		Scanner sc =  new Scanner(System.in);
		String or = sc.nextLine();
		System.out.print("original : "+or);
    String R = "";
    
    for (int i=0;i<or.length(); i++)
    {
    	R= or.charAt(i)+R;
    }
    System.out.println();
    System.out.println("rev : "+R);
	}

}
