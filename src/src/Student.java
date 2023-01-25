package src;

import java.util.*;

public class Student extends MenuItem {
	String student_name;
    ArrayList<Subject> studentSubjectList = new ArrayList<Subject>();
    
    School newSchool = new School();
    Scanner scan = new Scanner(System.in);
    Student(){
        this.actionName="Add Student";
    }
    
    void action()
    {
        try{
            if( newSchool.subjectList.isEmpty()){
                throw new Exception("Please Enter Subject First");
            }
            else{
                boolean repeat = true;
		        while(repeat){
		            System.out.println("  ");
		            System.out.print("Enter name:  ");
		            String studentName = scan.next();
		            Student newStudent = new Student();
		            newStudent.student_name = studentName;
                    newSchool.studentList.add(newStudent);
            
                    while(true){
                        System.out.println(" ");
		                System.out.print("Do you want to add more name?  Y - N  ");
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
            
                    for(int i=0; i<newSchool.studentList.size(); i++){
                        for(int j=0; j<newSchool.subjectList.size(); j++){
                            Subject newSubject = new Subject();
                            newSubject.subject_name = newSchool.subjectList.get(j);
                            newSchool.studentList.get(i).studentSubjectList.add(newSubject);
                        }
                    }
                
		        }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
