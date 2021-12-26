package xunhuan;
import java.util.Scanner;
public class F17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int n = input.nextInt();
		int i;
		int a;
		for(i=1;i<=n;i++) {
			for(a=1;a<=(n-i)*2;a++) {
				System.out.print(" ");
			}
			for(a=i;a>=1;a--) {
				System.out.print(a + " ");
			}
			for(a=2;a<=i;a++) {
				System.out.print(a + " ");
			}
			System.out.println(" ");	
		}	
	}

}
