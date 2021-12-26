package xunhuan;

public class F19 {

	public static void main(String[] args) {
		int n=7;
		int i;
		double a;
		for(i=0;i<=n;i++) {
			for(a=1;a<=(n-i)*2;a++) {
				System.out.print(" ");
			}
			for(a=1;a<=Math.pow(2, i);a=a*2) {
				System.out.print((int)a + " ");
			}
			for(a=Math.pow(2,i-1);a>=1;a=a/2) {
				System.out.print((int)a + " ");
			}
			System.out.println();	
		}	
	}

}