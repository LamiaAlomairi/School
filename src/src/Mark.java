package src;

import java.util.Scanner;

public class Mark extends MenuItem implements Repeating{
	Scanner scan = new Scanner(System.in);
	boolean markWhile = true;
	boolean repeat = true;
	int subject_mark;
	
	Mark(){
        this.actionName="Add Mark";
    }
    
    void action(){
        
            if(School.studentList.isEmpty()){
                System.out.println("Please Enter Student First");
            }
            else{
                
                while(markWhile){
                	try{
                    for (int i=0; i<School.studentList.size(); i++){ //show name list
		                int b=i+1;
                        System.out.println("["+b+"]"+School.studentList.get(i).student_name); 
                    }
                    
                    System.out.print("Enter Student Number:  ");
                    int student_Number = scan.nextInt();
                    student_Number--;
                    
                    if(student_Number>=0 && student_Number<School.studentList.size()){
                       
                        while(repeat){
                        	try {
                            for(int i=0; i<School.subjectList.size(); i++){ //show list of subject
                                System.out.println("["+(i+1)+"] " + School.subjectList.get(i).subject_name);
                            }
                            System.out.println("Enter Subject Number");
                            int subjectNumber = scan.nextInt();
                            subjectNumber--;
                            
                            if(subjectNumber < School.subjectList.size() && subjectNumber >= 0){
                                System.out.println("Enter Marks:");
                                int subjectMark = scan.nextInt();
                                try {
                                if(subjectMark>=0 && subjectMark<=100) {
                                
                                School.studentList.get(student_Number).studentSubjectList.get(subjectNumber).subjectMark.subject_mark = subjectMark;
                                repeat();
                                }
                                else {
                                	System.out.println("Please Enter Valid Mark");
                                }
                            }
                            catch(Exception ex){
                                System.out.println("Mark should be number from 0 to 100 ");
                                scan.next();
                            }
                                
                                
                            }
                            else{
                                System.out.println("Wrong Input ");
                            }
                        }
                        catch(Exception ex){
                            System.out.println("Wrong subject Input");
                            scan.next();
                        }
                            
                        }
                        
                        repeat = true;
                        
                    }
                    else{
                        System.out.println("Wrong Input ");
                    } 
                } 
            
                catch(Exception ex){
                    System.out.println("Wrong Student Input");
                    scan.next();
                }
                }
                markWhile = true;
                
            }
        
        
    }
    
    public void repeat() {
    	while(true){
            System.out.print("Do you want to add mark for other subject?(Y/N)   ");
            String select=scan.next();
            if(select.equals("N") || select.equals("n")){
                repeat = false;
                while(true){
                    System.out.print("Do you want to add mark for another student?(Y/N)   ");
                    String select2=scan.next();
                    if(select2.equals("N") || select2.equals("n")){
                        repeat = false;
                        markWhile = false;
                        break;
                    }
                    else if(select2.equals("y")||select2.equals("Y")){
                        //repeat = false;
                        break;
                    }
                    else{
                        System.out.println("Invalid letter  ");
                    }
                }
                break;
            }
            else if(select.equals("y")||select.equals("Y")){
                //repeat = false;
                break;
            }
            else{
                System.out.println("Invalid letter  ");
            }
        }
    }
    
}
