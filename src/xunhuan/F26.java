package xunhuan;
public class F26 {

	public static void main(String[] args) {

		for(int i=10000;i<=100000;i=i+10000) {
			
			double e=1;
			double item =1;
		   for(int n=1;n<=i;n++) {
			   item=item/n;
			   e =e+item;
			  }
		   System.out.println(e);
	    }
	}

}
