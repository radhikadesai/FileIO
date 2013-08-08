import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintFileContent {
	private TextFileReader fileReader;
	private ContentPrinter printer;

	public PrintFileContent(TextFileReader fileReader, ContentPrinter printer) {
		this.fileReader = fileReader;
		this.printer = printer;
	}

	public void readAndPrint(String fileName) throws IOException {
		List<String> content = fileReader.readFile(fileName);
		printer.print(content);
	}

}
