package OutrosTopicosBaiscosSobreJava_1;

import java.util.Scanner;

public class OperadorBItScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int mask =  0b100000;
		int n = scanner.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6bth bit is true!");
		}
		else {
			System.out.println("6bh bit is false!");
		}
		scanner.close();
	}

}
