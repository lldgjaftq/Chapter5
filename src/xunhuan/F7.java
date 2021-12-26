package xunhuan;

public class F7 {

	public static void main(String[] args) {
		double y = 10000;
		int i = 10;
		while(i>0) {
			y=y*1.05;
			i--;
		}
		y=y*1.05;
		System.out.println("10年后的学费为$" + (int)y);
		i = 4;
		double sum = 0;
		while(i>0) {
			y=y*1.05;
			sum=sum+y;
			i--;
		}
		System.out.println("4年内总学费为$" + (int)sum);
	}

}
