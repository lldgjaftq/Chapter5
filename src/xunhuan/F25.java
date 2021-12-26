package xunhuan;
public class F25 {

	public static void main(String[] args) {

		for(int i=10000;i<=100000;i=i+10000) {
			int f=1;
			double p=0;
		   for(int n=0;n<=i;n++) {
			p =p+ f/(2*n+1.0);
			f=-f;
		  }
		   p=4*p;
		   System.out.println(p);
	    }
	}

}