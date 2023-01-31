package src;
import java.util.*;
public class Main {
	
	static boolean program = true;
	static Stack<Integer> stack = new Stack<Integer>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	    Array firstMenu = new Array();
	    
	    int first_selection;
	    
	    while(program)
		{
	    	try {
	    		System.out.println();
			    System.out.println("Select Action: ");
			    
			    Menu.show(firstMenu.menu1);
			    first_selection = scan.nextInt();
			    if(first_selection >0 && first_selection <= firstMenu.menu1.size()) {
			    stack.push(first_selection);
			    first_selection--;
			    
			    firstMenu.menu1.get(first_selection).action();
			    
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
