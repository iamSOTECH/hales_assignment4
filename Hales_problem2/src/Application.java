import java.io.*;

public class Application {
	public static void main(String[] args) throws FileNotFoundException
	{
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		duplicateCounter.count("problem2.txt");
		duplicateCounter.write("unique_word_counts.txt");		
	}
}
