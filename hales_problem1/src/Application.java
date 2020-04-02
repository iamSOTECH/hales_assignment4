import java.io.*;
public class Application {
	public static void main(String[] args) throws FileNotFoundException
	{
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		duplicateRemover.remove("problem1.txt");
		duplicateRemover.write("unique_words.txt");
		
	}

}
