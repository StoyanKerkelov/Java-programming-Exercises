import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReturNtxtToString {

	/*Write a method that accepts a text file name as parameter,
 	reads its contents and returns it as a String*/
	public static void readFile(String fileName) {
		try (	//try with resorces constuction
				FileInputStream fileInput = new FileInputStream(
				fileName);
				BufferedReader buffReader = new BufferedReader(
				new InputStreamReader(fileInput));
				){
			StringBuilder stringBuilder = new StringBuilder();
			String[] directory = fileName.split("//");
			String name = directory[directory.length-1]; 		//title
			String ls = System.getProperty("line.separator");	//line separator
			stringBuilder.append(name)
						 .append(ls)
						 .append(ls);
			// add file name as title on the first row of the string
			String line = null;
			
			while ((line = buffReader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
			//fileInput.close();	//close stream	no need for close() when using Try with Resorces
			//buffReader.close();	//close buffer reader		no need for close() when using Try with Resorces
			
			System.out.println(stringBuilder.toString());
			//excaptions
		} catch (FileNotFoundException e) {
			// inform the client that there is
			// not such file
			System.out.println("The file \""
					+ fileName
					+ "\" does not exist! Unable to read it.");
		} catch (IOException ex) {
			// Exception handler for IOException
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		readFile("//home//ikata100//Desktop//workspace//IntroToProgJava11.Exception Handling//bin//task_8file.ini");
	}
}
