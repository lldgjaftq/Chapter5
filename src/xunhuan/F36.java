package xunhuan;

import java.util.Scanner;

public class F36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int isbn = input.nextInt();
		int isbn1 = isbn;
		int sum = 0;
		int n = 0;
		int i = 9;
		while(isbn>0) {
			n = isbn % 10;
			sum = sum + n*i;
			i--;
			isbn = isbn / 10;
		}
		System.out.print("The ISBN-10 number is ");
		for(n=i;n>0;n--) {
			System.out.print(0);
		}
		if(sum%11 == 10) {
			System.out.println(isbn1 + "X");
		}
		else{
			System.out.print(isbn1);
			System.out.println(sum%11);
		}

	}

}
