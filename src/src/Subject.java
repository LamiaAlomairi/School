package src;

import java.util.*;

public class Subject extends MenuItem implements Repeating{
	Scanner scan = new Scanner(System.in);
	String subject_name;
    Mark subjectMark = new Mark();
    boolean loop=true;
    
	Subject(){    
		this.actionName="Add Subject"; 
	}
    
    void action(){
        School newSchool = new School();
        try{
            if (newSchool.getSchool()==null){
                System.out.println("Please Enter School Name First  ");
            }
            else{
		        while(loop){
		            System.out.print("Write Subject Name:   ");
		            String subjectName = scan.next();
		            Subject newSubject = new Subject();
		            newSubject.subject_name=subjectName;
		            School.subjectList.add(newSubject);
		            
		            for(int i=0; i<School.studentList.size(); i++){
                        School.studentList.get(i).studentSubjectList.add(newSubject);
                    }
		            System.out.println("");
                    repeat();
                }
		        loop=true;
            }
        }
        catch(Exception e)
        {
           System.out.println("Error message");
        }
    }
    
    public void repeat() {
    	while(true)
        {
            System.out.print("Do you want to add subject? (y/n):    ");
            String choice=scan.next();
            if(choice.equals("N") || choice.equals("n"))
            {
            	loop=false;
                break;
            }
            else if(choice.equals("y")||choice.equals("Y"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid letter  ");
            }
        }
    }
}
