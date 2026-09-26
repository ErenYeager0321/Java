package ParametersVsArguement;

import MethodType.Method4;

//Argunments - Arguement Wo Hai Jo Method Call Me use ho
// Parameter - Parameter Method Declaration Me hote hai

public class PvA {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = Method4.add(a, b);//here A and B are Arguement
		System.out.println(result);
		//Or
		System.out.println(Method4.add(a, b));//Method Call
		
	}
	
//  	Methods with Parameters and Return Values	
//  Method Declaration
	public static int add(int a , int b) // Here Int a and Int b is Parameter
	{
		int c = a+b;
		return c;
	}
}
