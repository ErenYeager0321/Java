package Object.Creaton;

public class Fan2 {
public static void main(String[] args) {
	Fan f1 = new Fan();
	Fan f2 = new Fan();
	Fan f3 = new Fan();
	
	f1.color = "White" ; 
    f1.cost = 400;
    f1.brand = "Bajaj";
    
    f2.color = "White" ; 
    f2.cost = 400;
    f2.brand = "Bajaj";
    
    f3.color = "White" ; 
    f3.cost = 400;
    f3.brand = "Bajaj";
	
	
	f1.rotate();
	f1.giveair();
	f2.rotate();
	f2.giveair();
	f3.rotate();
	f3.giveair();
	
	
}
}
