package xunhuan;

import java.util.Scanner;

public class F22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int loanAmount = input.nextInt();
		System.out.print("Number of Years: ");
		int year =input.nextInt();
		System.out.print("Annual Interest Rate: ");
		int annualRate =input.nextInt();
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		double monthRate=annualRate/1200.0;
		double monthlyPayment = loanAmount * monthRate / (1- 1 / Math.pow(1 + monthRate, year * 12));
		double interest;
		double principal;
		double balance=loanAmount;
		for(int i=1;i<=year*12;i++) {
			interest =monthRate*balance;
			principal=monthlyPayment-interest;
			balance=balance-principal;
			double in=Math.round(interest*100)/100.0;
			double p=Math.round(principal*100)/100.0;
			double b=Math.round(balance*100)/100.0;//保留两位小数
			System.out.println(i+"\t\t"+in+"\t\t"+p+"\t\t"+b);
		}

	}

}
