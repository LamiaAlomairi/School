package src;

import java.util.Scanner;

public class SchoolDetail extends MenuItem {
	Scanner scan = new Scanner(System.in);
	static boolean setupWhile = true;
    SchoolDetail(){
        this.actionName = "Setup School Details";
    }
    
    void action()
    {
        while(setupWhile)
        {
            try {
            System.out.println("Select Action: ");
            
            Array secondMenu = new Array();
            int second_selection;
		    Menu.show(secondMenu.menu2);
		    second_selection = scan.nextInt();
		    if(second_selection >0 && second_selection <= secondMenu.menu1.size()) {
            second_selection--;
            secondMenu.menu2.get(second_selection).action();
		    }
		    else {
		    	System.out.println("Invalid input, please enter a valid input");
		    }
		} catch (Exception e) {
		    System.out.println("Invalid input, please enter a valid input");
		    scan.next(); // clear the buffer
		}
        }
        
        
    }
}
