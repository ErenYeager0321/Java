package T910_Access_Specifier;

/* if we use package this will give Commpilation error  */

//package com.library.data;
class DatabaseConnector {
	void connect() { //Default
	System.out.println("Database connected");
	}
}

//package com.library.app;
//import com.library.data.DatabaseConnector;
public class P3_Defaukt_AS {
	public static void main(String[] args) {
	DatabaseConnector dbConnector = new DatabaseConnector();
	dbConnector.connect();
	}
} 

