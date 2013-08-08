import java.util.List;


public class ContentPrinter {
	private ConsolePrinter consolePrinter;

	public ContentPrinter(ConsolePrinter consolePrinter) {
		this.consolePrinter = consolePrinter;
	}
	
	public void print(List<String> content) {
		for (String text : content) {
			consolePrinter.print(text);
		}
	}
}
