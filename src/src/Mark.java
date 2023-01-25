package src;

import java.util.Scanner;

public class Mark extends MenuItem {
	Scanner scan = new Scanner(System.in);
	Student newStudent = new Student();
	int subject_mark;
	
	Mark(){
        this.actionName="Add Mark";
    }
    
    void action()
    {
       // School newSchool = new School();
        
        try{
            
            if(School.studentList.isEmpty()){
                System.out.println("Please Enter Student First");
            }
            else{
                boolean markWhile = true;
                while(markWhile){
                    for (int i=0; i<School.studentList.size(); i++)   { //show name list
		                int b=i+1;
                        System.out.println("["+b+"]"+School.studentList.get(i).student_name); 
                    }
                    System.out.print("Enter Student Number:  ");
                    int student_Number;
                    student_Number = scan.nextInt();
                    student_Number--;
                    if(student_Number>=0 || student_Number<School.studentList.size()){
                        boolean repeat = true;
                        while(repeat){
                            for(int i=0; i<School.subjectList.size(); i++){
                                System.out.println("["+(i+1)+"] " + School.subjectList.get(i));
                            }
                            System.out.println("Enter Subject Number");
                            int subjectNumber = scan.nextInt();
                            subjectNumber--;
                            if(subjectNumber < School.subjectList.size() || subjectNumber >= 0){
                                System.out.println("Enter Marks:");
                                int subjectMark = scan.nextInt();
                                School.studentList.get(student_Number).studentSubjectList.get(subjectNumber).subjectMark.subject_mark = subjectMark;
                                while(true){
                                    System.out.print("Do you want to add marks for other subjects?(Y/N)   ");
                                    String select=scan.next();
		                            if(select.equals("N") || select.equals("n")){
		                                repeat = false;
		                                while(true){
                                            System.out.print("Do you want to enter marks for another student?(Y/N)   ");
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
                            else{
                                System.out.println("Wrong Number ");
                            }
                        }
                    }
                    else{
                        System.out.println("Wrong Number ");
                    } 
                } 
            }
        }
        catch(Exception ex){
            System.out.println("Please Enter Student First");
        }
    }
}
