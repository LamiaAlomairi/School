package src;

import java.util.ArrayList;

public class Menu {
	static void show(ArrayList<MenuItem> menu) 
    {
        for (int i = 0; i < menu.size(); i++)
        {
            System.out.println("["+(i+1) + "] " + menu.get(i).actionName);
            SchoolDetail.setupWhile = true;
        }
    }
}
