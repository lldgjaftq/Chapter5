package xunhuan;

import java.util.Scanner;

public class F38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal =input.nextInt();//decimal十进制的
		String octal = "";//octal八进制
		while(decimal != 0) {
			int octalValue = decimal % 8;
			octal = octalValue + octal;
			decimal = decimal / 8;
		}
		System.out.println("THe octal number is " + octal);
	}

}
