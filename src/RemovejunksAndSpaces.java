
public class RemovejunksAndSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "@#%%&meena $% gundi gh1%8";
		s=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(s);
		
		String s1= "@#%%&meena  $%  	gundi gh1%8";  // remove white spaces
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
