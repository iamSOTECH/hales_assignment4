import java.io.*;
import java.util.*;

public class DuplicateRemover {
	private Set<String> uniqueWords;

	public void remove(String dataFile) throws FileNotFoundException
	{
		File newFile = new File(dataFile);
		Scanner newScanner = new Scanner(newFile);
		uniqueWords = new HashSet<String>();
		
		while (newScanner.hasNext())
		{
			uniqueWords.add(newScanner.next());
		}
		newScanner.close();
	}
	
	public void write(String outputFile) throws FileNotFoundException
	{
		File newOutputFile = new File(outputFile);
		Scanner newOutputScanner = new Scanner(newOutputFile);
		try 
		{
			FileWriter newFileWriter = new FileWriter(newOutputFile, true);
		
			if (newOutputFile.exists())
			{
			newFileWriter.write(uniqueWords.toString() + "\n");
			System.out.println("Write() was successful in writing to a file \n");
			}
			else
			{
				newOutputFile.createNewFile();
				newFileWriter.write(uniqueWords.toString() + "\n");
				System.out.println("Write() was successful in creating a file\n");
			}
			newFileWriter.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		newOutputScanner.close();
	}
}
