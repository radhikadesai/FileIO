import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ContentPrinterTest {
	@Test
	public void itPrintsTextToConsole() {
		ConsolePrinter consolePrinter = mock(ConsolePrinter.class);
		ContentPrinter printer = new ContentPrinter(consolePrinter);
		List<String> content = new ArrayList<>();
		content.add("Hello");
		content.add("World");
		//When
		printer.print(content);
		
		//Then
		verify(consolePrinter).print("Hello");
		verify(consolePrinter).print("World");
	}
	
}
