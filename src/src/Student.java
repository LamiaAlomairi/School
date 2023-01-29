package src;

import java.util.*;

public class Student extends MenuItem implements Repeating{
	Scanner scan = new Scanner(System.in);
	ArrayList<Subject> studentSubjectList = new ArrayList<Subject>();
	HashSet<String> emailList = new HashSet<>();
	
	String student_name;
	String email;
    private boolean again = true;
    
    Student(){
        this.actionName="Add Student";
    }
    
    void action(){
        try{
            if( School.subjectList.isEmpty()){
                throw new Exception("Please Enter Subject First");
            }
            else{
                
		        while(again){
		            System.out.println("  ");
		            System.out.print("Write Student name:  ");
		            String studentName = scan.next();
		            
		            Student newStudent = new Student();
		            newStudent.student_name = studentName;
                    School.studentList.add(newStudent);
                    
                    System.out.print("Enter student email:  ");
		            String student_email = scan.next();
		            newStudent.email = student_email;
		            newStudent.emailList.add(email);
		            
                    repeat();
                    
                    for(int i=0; i<School.studentList.size(); i++){
                        for(int j=0; j<School.subjectList.size(); j++){
                        	Subject newSubject = new Subject();
                            newSubject.subject_name = School.subjectList.get(j).subject_name;
                            School.studentList.get(i).studentSubjectList.add(newSubject);
                        }
                    }
                    
		        }
		        again = true;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public void repeat() {
    	while(true){
            System.out.println(" ");
            System.out.print("Do you want to add more name?  Y - N  ");
            String select=scan.next();
            if(select.equals("N") || select.equals("n")){
            	again = false;
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
