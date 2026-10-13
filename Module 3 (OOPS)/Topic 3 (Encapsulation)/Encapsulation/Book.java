package Encapsulation;

public class Book {
    private int pageNo ;
	
    static int defaultpage=0;
    
    //SETTER
	public void setPage(int x) {
		if(x>0)//Positive value hogi tab hi lenge 
		pageNo = x;
		else
		pageNo = ++defaultpage;
	}

	
	//GETTER
	public int getPage() {
		return pageNo;
	}
}
