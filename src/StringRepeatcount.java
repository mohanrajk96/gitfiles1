
public class StringRepeatcount {
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		String t = "mohanraj krishnan";
		int c;
		StringBuilder s = new StringBuilder(t);
		
		System.out.println(s);
		for (int i=0;i<t.length(); i++)
		{
			c=0;
			
			for(int j=0;j<s.length();j++)
			{
				if (t.charAt(i)==s.charAt(j)&& s.charAt(j)!= ' ')
				{
					c++;
					s.setCharAt(j, '0'); //dont check with visited charc
				}
			} if (c>1)
			{
				System.out.println("Repeated"+ " " +t.charAt(i)+ " "+c);
				
			}
		}
		
			
	}

}
