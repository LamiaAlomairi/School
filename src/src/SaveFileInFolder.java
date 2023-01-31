package src;

import java.io.*;
import java.util.*;
public class SaveFileInFolder extends MenuItem{
	Scanner scan = new Scanner(System.in);
	SaveFileInFolder(){
        this.actionName="Save File In New Folder";
    }
    
    void action()
    {
    	try {
    	System.out.println("Enter Folder Name: ");
    	String folderName = scan.next();
    	String folderPath = folderName;
        String filePath = folderPath + "/SchoolFile.txt";

        File folder = new File(folderPath);
        folder.mkdirs();

        FileWriter writer = new FileWriter(filePath);
        writer.write("Hello, this is the content of the file.");
        writer.close();
    	}
    	catch (IOException e) {
  	      System.out.println("An error occurred while writing to the file.");
  	      e.printStackTrace();
  	    }
    }
}
