package src;
import java.io.*;
public class CreateFile extends MenuItem{
	CreateFile(){
        this.actionName="Save School Data into file";
    }

	void action() {
		
	    try {
	    	File file = new File("SchoolFile.txt"); 
			
			if (file.createNewFile()) {
			System.out.println("File created ");
			
			
			} 
			 else {
			System.out.println("File already exists.");
			}
			
			System.out.println("File name: " + file.getName());
	    	
		      // Open the file in write mode
		      FileWriter files = new FileWriter("SchoolFile.txt");
		      
		      files.write("______________________________________________________________ \n");
		      files.write("School Name: " + School.school_name + "\n");
		      files.write("______________________________________________________________ \n");          
		      
	          for(int i=0; i < School.studentList.size(); i++){
	        	  files.write("Student Name: " + School.studentList.get(i).student_name +"\n");
	                  
	                  for(int j=0; j<School.subjectList.size(); j++){
	                	  files.write(School.subjectList.get(j).subject_name + " mark is: " + 
	                      School.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark +"\n");
	                  }
	                  files.write("______________________________________________________________ \n");
	          }
	          
		      files.close();
		      System.out.println("Data written to file successfully.");
			
	    } catch (IOException e) {
	      System.out.println("An error occurred while writing to the file.");
	      e.printStackTrace();
	    }
	    
	    
	  //Serializarion
	      try{
	          FileOutputStream filed = new FileOutputStream("StudentDetails.txt");
	          ObjectOutputStream out = new ObjectOutputStream(filed);
	          out.writeObject("School Name: " + School.school_name + "\n");
	          out.writeObject("______________________________________________________________ \n");          
		      
	          for(int i=0; i < School.studentList.size(); i++){
	        	  out.writeObject("Student Name: " + School.studentList.get(i).student_name +"\n");
	                  
	                  for(int j=0; j<School.subjectList.size(); j++){
	                	  out.writeObject(School.subjectList.get(j).subject_name + " mark is: " + 
	                      School.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark +"\n");
	                  }
	                  out.writeObject("______________________________________________________________ \n");
	          }
	          out.close();
	          filed.close();
	          System.out.println("serialized and saved");
	   
	      }catch (Exception e){
	        e.printStackTrace();
	   
	      }
	      
	      
	      // Deserialization
	      try
	      {
	          // Reading the object from a file
	          FileInputStream file = new FileInputStream("StudentDetails.txt");
	          ObjectInputStream in = new ObjectInputStream(file);
	          in.close();
	          file.close();
	  
	          System.out.println("Object has been deserialized ");
	          System.out.println("School Name: " + School.school_name);
	          for(int i=0; i < School.studentList.size(); i++){
	        	  System.out.println("Student Name: " + School.studentList.get(i).student_name +"\n");
	                  
	                  for(int j=0; j<School.subjectList.size(); j++){
	                	  System.out.println(School.subjectList.get(j).subject_name + " mark is: " + 
	                      School.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark +"\n");
	                  }
	                  System.out.println("______________________________________________________________ \n");
	          }
	         
	      }
	  
	      catch(IOException ex)
	      {
	          System.out.println("IOException is caught");
	      }
	    
	    
	}

}
