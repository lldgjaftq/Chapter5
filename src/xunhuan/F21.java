package xunhuan;
import java.util.Scanner;
public class F21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		int l = input.nextInt();
		System.out.print("Number of Years: ");
		int y =input.nextInt();
		System.out.println("Interest Rate" +"    "+"Monthly Payment" + "    " + "Total Payment");
		for(double i = 5;i<=8;i=i+0.125) {
			double m =i/1200.0;
			double monthlyPayment = l * m / (1- 1 / Math.pow(1 + m, y * 12));
			double totalPayment = monthlyPayment * 12 * y;
			monthlyPayment=Math.round(monthlyPayment*100)/100.0;
			totalPayment=Math.round(totalPayment*100)/100.0;
			double t =(i*1000)/1000.0;
			System.out.printf("%.3f",t);
			System.out.println("%           "+ monthlyPayment + "             " + totalPayment);
		}

	}

}
