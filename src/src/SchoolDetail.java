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
            
            System.out.println("Select Action: ");
            //Menu callMenu = new Menu();
            Array secondMenu = new Array();
            int second_selection;
		    Menu.show(secondMenu.menu2);
		    second_selection = scan.nextInt();
            second_selection--;
            secondMenu.menu2.get(second_selection).action();
        }
    }
}
