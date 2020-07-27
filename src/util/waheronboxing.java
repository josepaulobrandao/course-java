package util;

public class waheronboxing {
public static void main(String[] args) {
	
	int x = 20;
	
	Integer obj = x;
	System.out.println(obj); //BOXING 
	
	int y = obj * 2; 		//UNBOXING
	System.out.println(y); 
	}
}
