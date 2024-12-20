
public class CountrepeatcharcterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "meenaMohanrajKrishnan";
		int total_count = s.length();
		System.out.println("length : "+ total_count);
		int replace_count = s.replaceAll("a","").length();
		int n= total_count - replace_count;
		System.out.println(n);

	}

}
