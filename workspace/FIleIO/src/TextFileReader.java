import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TextFileReader {
	
	public List<String> readFile(String fileName) throws IOException {
		List<String> content = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = null;
		while((line = reader.readLine()) != null) {
			content.add(line);
		}
		return content;
	}
}