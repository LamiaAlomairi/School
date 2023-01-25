package src;

import java.util.Scanner;

public class Subject extends MenuItem 
{
	String subject_name;
    Mark subjectMark = new Mark();
    
	Subject(){    this.actionName="Add Subject"; }
    
    void action()
    {
        Scanner scan = new Scanner(System.in);
        School newSchool = new School();
        try
        {
            if (newSchool.getSchool()=="")
            {
                System.out.println("Please Enter School Name First  ");
            }
            else
            {
                boolean repeat=true; 
		        while(repeat)
		        {
		            System.out.print("Write Subject Name:   ");
		            String subjectName = scan.next();
		            newSchool.subjectList.add(subjectName);
		            for(int i=0; i<newSchool.studentList.size(); i++)
		            {
                        Subject newSubject = new Subject();
                        newSubject.subject_name = subjectName;
                        newSchool.studentList.get(i).studentSubjectList.add(newSubject);
                    }
		            System.out.println("");
                    while(true)
                    {
		                System.out.print("Do you want to add subject? (y/n):    ");
		                String choice=scan.next();
		                if(choice.equals("N") || choice.equals("n"))
		                {
		                    repeat=false;
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
        }
        catch(Exception ex)
        {
            System.out.println("Please Enter School Name First");
        }
    }
}
