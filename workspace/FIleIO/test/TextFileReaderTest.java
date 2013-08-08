import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


public class TextFileReaderTest {
	@Test
	public void readsAFIle() throws IOException {
		//Given
		String fileName = "/home/radhika/Door.java";
		TextFileReader fileReader = new TextFileReader();
		//When
		List<String> actualText= fileReader.readFile(fileName);
		
		//Then
		Assert.assertEquals("Hello", actualText.get(0));
		Assert.assertEquals("World", actualText.get(1));
				
	}
}
