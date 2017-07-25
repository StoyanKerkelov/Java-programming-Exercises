import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

	/*The first level of excepition catching is in the readFile () method and the next 
	level is in the main () method. The readFile () method only captures the exceptions 
	of the FileNotFoundException, and skips all other IOException exceptions to the
	main () method where they are trapped and processed.
	
	If in the main () method we write a name for a non-existent file, 
	FileNotFoundException will occur which will be captured in readFile(). However, 
	if an existing file is named and an error occurs while reading the file itself, the 
	exception will be catched in the main () method.

	*/

public class ExceptionCatching {

	public static void main(String[] args) {
		try {								
			readFile("C:\\tools\\eclipse\\eclipse.ini");
		} catch (IOException e) {		//IOE in main()
			e.printStackTrace();
		}
	}

	public static void readFile(String fileName) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String tmp = null;
			while ((tmp = in.readLine()) != null) {
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {		// in readFile method()
			System.out.println("The file \""
					+ fileName
					+ "\" does not exist! Unable to read it.");
		}
	}
}