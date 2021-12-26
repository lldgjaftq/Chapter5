package xunhuan;
import java.util.Scanner;
public class F37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int decimal =input.nextInt();//decimal十进制的
		String binary = "";//binary二进制
		while(decimal != 0) {
			int binaryValue = decimal % 2;
			binary = binaryValue + binary;
			decimal = decimal / 2;
		}
		System.out.println("THe binary number is " + binary);
	}

}
