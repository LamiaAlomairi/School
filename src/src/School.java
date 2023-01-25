package src;

import java.util.ArrayList;
import java.util.Scanner;

public class School extends MenuItem {
	
    static ArrayList<String> subjectList = new ArrayList<String>();
    static ArrayList<Student> studentList = new ArrayList<Student>();
    static Scanner scan = new Scanner(System.in);
    static String school_name;
    
    public void setSchool(String name){
        this.school_name = name;
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
