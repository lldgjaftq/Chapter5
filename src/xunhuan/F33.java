package xunhuan;

public class F33 {

	public static void main(String[] args) {
		
	    for(int i=1;i<=10000;i++) {
	    	int h=0;
	    	int[] number=new int[i/2];
    		for (int b = 0;b<i/2;b++) {
    			number[b] = 0;
    		}
	    	for(int j=1;j<=i/2;j++) {
	    		if(i%j==0) {
	    			number[h]=j;
	    			h++;
	    		}
	    	}
	    	int x=0;
	    	for (int b = 0;b<h;b++) {
    			x += number[b];
	    	}
	    	if(x==i) {
	    	System.out.println(x);
	    	}
	    }
	}

}
