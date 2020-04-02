import java.io.*;
import java.util.*;

public class DuplicateCounter {
	private HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile) throws FileNotFoundException 
	{
		File newFile = new File(dataFile);
		Scanner newScanner = new Scanner(newFile);
		wordCounter = new HashMap<String, Integer>();
		
		while (newScanner.hasNext())
		{
			String scannedWord = newScanner.next();
			if (wordCounter.containsKey(scannedWord))
			{
				wordCounter.put(scannedWord, wordCounter.get(scannedWord) + 1);	
			}
			else
			{
				wordCounter.put(scannedWord, 1);	
			}
		}
		newScanner.close();
	}
	
	public void write(String outputFile) throws FileNotFoundException
	{
		File newOutputFile = new File(outputFile);
		Scanner newOutputScanner = new Scanner(outputFile);
		try 
		{
			FileWriter newFileWriter = new FileWriter(newOutputFile, true);
		
			if (newOutputFile.exists())
			{
			newFileWriter.write(wordCounter.toString() + "\n");
			System.out.println("Write() was successful in writing to a file \n");
			}
			else
			{
				newOutputFile.createNewFile();
				newFileWriter.write(wordCounter.toString() + "\n");
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
