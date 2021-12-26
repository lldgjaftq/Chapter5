package xunhuan;

import java.util.Scanner;

public class F45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[]  numbers = new double[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0;i<10;i++) {
			numbers[i] = input.nextDouble();
		}
		double sum = 0;
		for (int i = 0;i < 10;i++) {
			sum  += numbers[i];
		}
		double mean = sum / 10;
		double s=0;
		for (int i = 0;i < 10;i++) {
			s  += numbers[i]*numbers[i];
		}
		double standardDeviation = Math.pow((s - sum*sum/10)/9,0.5);
		standardDeviation= Math.round(standardDeviation*100000)/100000.0;//保留五位小数
		System.out.println("The mean is "+ mean);
		System.out.println("The standard deviation is "+ standardDeviation);
	}

}
