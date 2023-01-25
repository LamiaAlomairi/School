package src;

import java.util.Scanner;

public class SearchStudent extends MenuItem {
	SearchStudent(){
        this.actionName="Search Student";
    }
    
    void action()
    {
        Scanner scan = new Scanner(System.in);
        School newSchool = new School();
        int sum =0;
        boolean repeat = true;
        while(repeat){
            System.out.println("_____________________________________________________________");
            System.out.print("Enter Student name to Search:    ");
            String searchName = scan.next();
            for(int i=0; i < newSchool.studentList.size(); i++){
                if(newSchool.studentList.get(i).student_name.equals(searchName)){
                    System.out.println("School Name: " + newSchool.getSchool());
                    System.out.println("Student Name: " + newSchool.studentList.get(i).student_name);
                    for(int j=0; j<newSchool.subjectList.size(); j++){
                        System.out.println(newSchool.subjectList.get(j) + " mark is: " + 
                        newSchool.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark);
                    }
                sum = sum +1;
                }
            }
            if(sum == 0){
                System.out.println("Not Found!");
            }
            System.out.println("________________________________________________________");
                    
            while(true){
                System.out.println(" ");
		        System.out.print("Do you want to search another name?  Y - N  ");
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
}
