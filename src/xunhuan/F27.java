package xunhuan;

public class F27 {

	public static void main(String[] args) {
		int t=0;
		for(int i=101;i<=2100;i++) {
			if((i%4==0&&i%100!=0)||(i%400==0)) {
				System.out.print(i+ " ");
				t++;
			}
			if(t==10) {
				t=0;
				System.out.println();
			}
		}
	}

}
