import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("D:\\software testing\\UTUBE\\data.txt");
		BufferedWriter b= new BufferedWriter(f);
		b.write(" selenium java");
		b.write(" selenium corejava");
		System.out.println("Finished");
		b.close();

	}

}
