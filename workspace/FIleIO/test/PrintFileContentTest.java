import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Matchers.*;


public class PrintFileContentTest {

	@Test
	public void itPrintsFileContent() throws IOException {
		TextFileReader reader = new TextFileReader();
		ConsolePrinter consolePrinter = mock(ConsolePrinter.class);
		ContentPrinter printer = new ContentPrinter(consolePrinter);
		PrintFileContent fileReader = new PrintFileContent(reader, printer );
		String fileName = "/home/radhika/Door.java";
		
		//when
		fileReader.readAndPrint(fileName);
		
		//Then
		verify(consolePrinter).print("Hello");
		verify(consolePrinter).print("World");
		
	}

		
}
