package src;

import java.util.ArrayList;
import java.util.Scanner;

public class School extends MenuItem {
	
    static ArrayList<Subject> subjectList = new ArrayList<Subject>();
    static ArrayList<Student> studentList = new ArrayList<Student>();
    static Scanner scan = new Scanner(System.in);
    static String school_name;
    
    public void setSchool(String name){
        School.school_name = name;
    }
    
    public String getSchool()
    {
    	return school_name;       
    }
    
	School(){
        this.actionName="Add School Name";
    }
    
    void action()
    {
        
        System.out.print("Write School Name:  ");
        school_name = scan.next();
        System.out.println(" ");
    }
    
}
