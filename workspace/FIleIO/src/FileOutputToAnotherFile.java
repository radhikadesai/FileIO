import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileOutputToAnotherFile {

	public static void outputToAnotherFile(File file, String output) throws IOException {
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(output);
		bw.close();
	}

}
