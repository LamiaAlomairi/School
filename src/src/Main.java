package src;
import java.util.*;
public class Main {
	
	static boolean program = true;
	static Stack<Integer> stack = new Stack<Integer>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	    //Menu callMenu = new Menu();
	    Array firstMenu = new Array();
	    
	    int first_selection;
	    
	    while(program)
		{
		    System.out.println();
		    System.out.println("Select Action: ");
		    
		    Menu.show(firstMenu.menu1);
		    first_selection = scan.nextInt();
		    stack.push(first_selection);
		    first_selection--;
		    
		    firstMenu.menu1.get(first_selection).action();
		    
		}

	}

}
