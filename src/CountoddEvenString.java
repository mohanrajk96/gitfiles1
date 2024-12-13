
public class CountoddEvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "1457678";
		char s; int e=0,o=0;
		for(int i=0; i<t.length(); i++)			
		{
			s=t.charAt(i);
			System.out.print(s);		
			if (s%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}System.out.println();		
			System.out.println("Even"+ +e);
			System.out.println("odd"+ +o);

	}

}
