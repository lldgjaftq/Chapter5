package xunhuan;
import java.util.Scanner;
public class F28 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("输入年份和代表该年第一天是星期几： ");
	 
		int year=input.nextInt();
		int W=input.nextInt();
		String M=null;
		int m=1;
		boolean leapyear=(year%4==0&&year%100!=0)||(year%400==0);
		for(m=1;m<13;m++) {
			if(m==1) {
				M="January";
				W=2;}
			else if(m==2) {
				M="February";
				W=(31%7+W)%7;
			} 
			else if(m==3) {
				M="March";
				if(leapyear) {
					W=(29%7+W)%7;
				}else {
					W=(28%7+W)%7;
				}
			}else if(m==4) {
				M="April";
				W=(31%7+W)%7;
			}
			else if(m==5) {
				M="May";
				W=(30%7+W)%7;
			}else if(m==6) {
				M="June";
				W=(31%7+W)%7;
			}else if(m==7) {
				M="July";
				W=(30%7+W)%7;
			}else if(m==8) {
				M="August";
				W=(31%7+W)%7;
			}else if(m==9) {
				M="September";
				W=(31%7+W)%7;
			}else if(m==10) {
				M="October";
				W=(30%7+W)%7;
			}else if(m==11) {
				M="November";
				W=(31%7+W)%7;
			}else if(m==12) {
				M="December";
				W=(30%7+W)%7;
			}
			switch(W) {
			case 1:System.out.println(M+" 1,"+year+" is Monday");break;
			case 2:System.out.println(M+" 1,"+year+" is Tuseday");break;
			case 3:System.out.println(M+" 1,"+year+" is Wednesday");break;
			case 4:System.out.println(M+" 1,"+year+" is Thursday");break;
			case 5:System.out.println(M+" 1,"+year+" is Friday");break;
			case 6:System.out.println(M+" 1,"+year+" is Saturday");break;
			case 0:System.out.println(M+" 1,"+year+" is Sunday");break;

			}
		}

	}

}
