package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fin=new FileReader("d:/B.txt");
		
		try {
			int i = 0;
			while(i!=-1)
			{
			i=fin.read();
			System.out.println((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
