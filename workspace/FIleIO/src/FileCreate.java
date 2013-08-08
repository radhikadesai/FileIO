import java.io.File;
import java.io.IOException;


public class FileCreate {

	public File generateFile() throws IOException {
		File file=new File("/home/radhika/newFile.txt");
		file.createNewFile();
		return file;
	}

}
