import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFrmText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//***************Approach1 Buffered Reader*******************
		FileReader fr = new FileReader ("D:\\software testing\\UTUBE\\data.txt");  // Location
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s=br.readLine())!= null)
		{
			System.out.println(s);
		}br.close(); 
		
		//***************Approach 2 File and Scanner*******************
		
		File f = new File ("D:\\software testing\\UTUBE\\data.txt");
		Scanner sc = new Scanner(f);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	}

}
