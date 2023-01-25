package src;

public class AppStatistic extends MenuItem {
	AppStatistic(){
        this.actionName="App Statistic";
    }
    
    void action()
    {
    	int selection1 = 0;
        int selection2 = 0;
        int selection3 = 0;
        int selection4 = 0;
        int selection5 = 0;
        
            for(int i=0; i<Main.stack.size(); i++){
                if (Main.stack.get(i)== 1) {
                    selection1++;
                }
                else if(Main.stack.get(i) == 2){
                   selection2++; 
                }
                else if(Main.stack.get(i) == 3) {
                    selection3++;
                }
                else if(Main.stack.get(i )== 4){
                   selection4++; 
                }
                else if(Main.stack.get(i) == 5){
                   selection5++; 
                }
                
            }
            
            System.out.println("Setup School Details =  "+selection1);
            System.out.println("Enter Students       =  "+selection2);
            System.out.println("Enter Grade          =  "+selection3);
            System.out.println("Print List           =  "+selection4);
            System.out.println("Search Students      =  "+selection5);
            
    }	
    
}
