package Class_object;

public class pgApp {
	public static void main(String[] args) {
//		pg p = new pg();
		pg p;
		p=new pg();
		p.id =10;
		p.name ="KodPg";
		p.address = "6th floor , CPR Towers , Vysya bank colony , stage 2 BTM layout B";
		p.customerName="Ramesh";
		p.accomadateCustomer();
		p.provideOtherServices();
		}
}
