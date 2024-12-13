
public class PrintevenoddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] a= { 5,4,3,9, 7, 8, 6,};
			 String e="", o="";
			for (int i=0; i<a.length; i++)
			{
				if (a[i]%2==0)
				{
					e=e+a[i]+" ";
				} else o=o+a[i]+" ";
			}
			System.out.print("Even " +e );
			System.out.println();
			System.out.print("odd "+o);

	}

}
