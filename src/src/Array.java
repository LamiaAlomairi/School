package src;

import java.util.ArrayList;

public class Array {
	ArrayList<MenuItem> menu1 = new ArrayList<MenuItem>(); 
    ArrayList<MenuItem> menu2 = new ArrayList<MenuItem>();
    Array()
    {
        this.menu1.add(new SchoolDetail());
	    this.menu1.add(new Student());
	    this.menu1.add(new Mark());
	    this.menu1.add(new PrintList());
	    this.menu1.add(new SearchStudent());
	    this.menu1.add(new AppStatistic());
	    this.menu1.add(new Exit());
	    
	    this.menu2.add(new School());
	    this.menu2.add(new Subject());
	    this.menu2.add(new GoBack());
    }
    
}
