package T1_Has_A_Realtionship;

public class MainApp {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("IQOO", 18000); 
		System.out.println("Mobile Details : "+mobile.brand+" "+mobile.cost );
		System.out.println("OS Details : " + mobile.Os.name+" "+mobile.Os.version );
		mobile.Os.operate();
	
		Charger charger = new Charger("White", 44);
		mobile.ref = charger;
		System.out.println("Charger Details : "+mobile.ref.color+" "+mobile.ref.watts);
		mobile.ref.charge();
		
		mobile=null;//after that mobile ke andar ka kuch nai chalega iske uper chalenge iske baad se nai
		System.out.println("Mobile Lost");
	/*	System.out.println("OS Details : " + mobile.Os.name+" "+mobile.Os.version );
		mobile.Os.operate(); //Cannot read field "Os" because "mobile" is null , this Error will show
		*/
		// But We Can Still Call Charger
		System.out.println("Mobile Lost But Charger Color : "+charger.color+" "+charger.watts);
	}
}
