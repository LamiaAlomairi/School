package src;

import java.io.*;
import java.util.*;
public class SearchFromFile extends MenuItem{
	boolean repeat = true;
	Scanner scan = new Scanner(System.in);
	SearchFromFile(){
        this.actionName="Search Words From File";
    }
    
    void action()
    {
    	
    	


    	try {
        while(repeat){
            
        	String filePath = "SchoolFile.txt";
        	System.out.print("Enter Word to Search:    ");
            String word = scan.next();

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
              String[] words = line.split("\\s+");
              for (String w : words) {
                if (w.equals(word)) {
                  count++;
                }
                
              }
            }
            if(count ==0) {
           	 System.out.println("Word not found");
           }
            else {
            System.out.println("Word "+word+" repeated " + count + " times.");
            }
            br.close();
        	
        	
            repeat();
       }
        repeat=true;
        
    	}
    catch (IOException e) {
	      System.out.println("An error occurred while writing to the file.");
	      e.printStackTrace();
	    }
        
    }
    
    public void repeat() {
    	while(true){
            System.out.println(" ");
	        System.out.print("Do you want to search another word?  Y - N  ");
	        String select=scan.next();
	        if(select.equals("N") || select.equals("n")){
	            repeat = false;
	            break;
	        }
	        else if(select.equals("y")||select.equals("Y")){
	            break;
	        }
	        else{
	            System.out.println("Invalid letter  ");
	        }
        }
    }
}
