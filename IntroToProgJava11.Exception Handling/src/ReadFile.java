import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//create program that reads text file and throws exceptions IOException and FileNotFoundException
//readFile("//home//ikata100//Desktop//workspace//IntroToProgJava11.Exception Handling//bin//testFile.ini");

public class ReadFile {

	public static void readFile(String fileName) throws IOException {
		FileInputStream fis = null;
		BufferedReader in = null;
		try {
			fis = new FileInputStream(fileName); // first open last
								// closed
			in = new BufferedReader(new InputStreamReader(fis));
			String tmp = null;
			while ((tmp = in.readLine()) != null) {
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file \""
					+ fileName
					+ "\" does not exist! Unable to read it.");
		} finally {
			if (in != null) {
				in.close();
			}
			if (fis != null) {
				fis.close(); // first open last closed
			}
		}
	}

	public static void main(String[] args) {
		try {
			readFile("C:\\tools\\eclipse\\eclipse.ini");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
