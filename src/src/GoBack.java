package src;

public class GoBack extends MenuItem {
	GoBack(){
        this.actionName="Go Back";
    }
    
    void action()
    {
        SchoolDetail.setupWhile = false;
        
    }
}
