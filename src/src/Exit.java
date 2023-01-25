package src;

public class Exit extends MenuItem {
	Exit(){
        this.actionName="Exit";
    }
    
    void action()
    {
        Main.program = false;
    }
}
