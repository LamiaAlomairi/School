package src;

import java.io.*;
import java.util.*;
public class SearchFromFile extends MenuItem{
	boolean repeat = true;
	Scanner scan = new Scanner(System.in);
	SearchFromFile(){
        this.actionName="Search Words From File";
    }
    
    void action(){
    	try {
    		//to search multiple words in same time
        	System.out.print("Enter the words to search for, separated by a space: ");
            String[] words = scan.nextLine().split(" ");
            
            HashMap<String, Integer> wordCounts = new HashMap<>();
            for (String word : words) {
              wordCounts.put(word, 0);
            }
            
            try (BufferedReader read = new BufferedReader(new FileReader("SchoolFile.txt"))) {
              String line;
              while ((line = read.readLine()) != null) {
                for (String word : words) {
                  if (line.contains(word)) {
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                  }
                }
              }
            } catch (IOException e) {
            	System.out.println("An error occurred when search from file.");
            }
            
            for (HashMap.Entry<String, Integer> entry : wordCounts.entrySet()) {
              System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        	
    	}
    	catch (Exception e) {
	      System.out.println("An error occurred while writing to the file.");
	    }
        
    }
    
}
