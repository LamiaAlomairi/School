package src;

public class PrintList extends MenuItem {
	School newSchool = new School();
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
            System.out.println("  Student Name          Subject               Mark");
            System.out.println("______________________________________________________________");
            for (int i = 0; i < School.studentList.size(); i++) {
                for (int j = 0; j < School.subjectList.size(); j++) {
                    System.out.println("      "+School.studentList.get(i).student_name+"         "+ 
                    School.subjectList.get(j)+"          "+ 
                    School.studentList.get(i).studentSubjectList.get(j).subjectMark.subject_mark);
                }
            }
            System.out.println("_____________________________________________________________");
        }
    }
}
