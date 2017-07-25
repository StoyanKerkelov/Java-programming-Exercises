import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleException {
	public static void readFile(String fileName) {
		try( //try with resources try(statement){body}
			// Exceptions could be thrown below
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader(
					new InputStreamReader(fis));){
			String line = null;
			while ((line = in.readLine()) != null) {	// print what you read
				System.out.println(line);
			}
			/*no need to close when using try with resources
			in.close();	//close strean
			fis.close();	//close buffer reader*/
		} catch (FileNotFoundException e) {
			// inform the client that there is
			// not such file
			System.out.println("The file \""
				+ fileName+ "\" does not exist! Unable to read it.");
		} catch (IOException e) {
			// Exception handler for IOException
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//readFile("C:\\tools\\eclipse\\eclipse.ini");	//test non working file
		readFile("//home//ikata100//Desktop//workspace//IntroToProgJava11.Exception Handling//bin//testFile.ini");
	}
}
