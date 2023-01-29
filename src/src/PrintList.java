package src;

//import java.util.*;

public class PrintList extends MenuItem {
	School newSchool = new School();
	Student newStudent = new Student();
	PrintList(){
        this.actionName="Print List";
    }
    
    void action()
    {
        
        if (School.studentList.size() == 0) {
            System.out.println("No student in the List ");
        }
        else {
            System.out.println("______________________________________________________________");
            System.out.println("      "+ newSchool.getSchool() +" School                    ");
            System.out.println("______________________________________________________________");
            System.out.printf("%15s %15s %15s %15s","Student Name","Student Email","Subject","Mark");
            System.out.println();
            System.out.println("______________________________________________________________");
            for (int i = 0; i < School.studentList.size(); i++) {
                for (int j = 0; j < School.subjectList.size(); j++) {
                    System.out.printf("%15s %15s %15s %15s",School.studentList.get(i).student_name,
                    School.studentList.get(i).email,
                    School.subjectList.get(j).subject_name,
                    School.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark);
                    System.out.println();
                    System.out.println("_____________________________________________________________");
                }
            }
        }
    }
}
