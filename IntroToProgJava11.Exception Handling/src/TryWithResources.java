import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TryWithResources {

	/*
	 * ////////////////try-with-resources//////////////
	 * 
	 * From Java 7+ a new mechanism existx that closes the resources used in
	 * the try-catch block
	 * 
	 * <<To use a class with try-with-resources statement it should
	 * implement AutoCloseable interface and the close() method of it gets
	 * invoked automatically at runtime.>>
	 * 
	 * try(FileReader fr = new FileReader("file path")) { // use the
	 * resource }catch() { // body of catch }
	 */

	public static void writeToFileZipFileContents(String zipFileName,
			String outputFileName) throws java.io.IOException {

		java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
		java.nio.file.Path outputFilePath = java.nio.file.Paths
				.get(outputFileName);

		// Open zip file and create output file with
		// try-with-resources statement

		try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(
				zipFileName);
				java.io.BufferedWriter writer = java.nio.file.Files
						.newBufferedWriter(
								outputFilePath,
								charset)) {
			// Enumerate each entry
			for (java.util.Enumeration entries = zf.entries(); entries
					.hasMoreElements();) {
				// Get the entry name and write it to the output
				// file
				String newLine = System
						.getProperty("line.separator");
				String zipEntryName = ((java.util.zip.ZipEntry) entries
						.nextElement()).getName()
						+ newLine;
				writer.write(zipEntryName, 0,
						zipEntryName.length());
			}
		}
	}
}