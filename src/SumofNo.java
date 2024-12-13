
public class SumofNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234; 
		int r=0,m = 0;
		while (n>0)
		{
		r = n%10; //3
		m=r+m;
				n=n/10;
			
		}
		System.out.print(m);

	}

}
