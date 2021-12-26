package xunhuan;

import java.util.Scanner;

public class F29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("输入年份和代表该年第一天是星期几： ");		 
		int year=input.nextInt();
		int d=input.nextInt();
		int i=0;
		boolean leapyear=(year%4==0&&year%100!=0)||(year%400==0);
		
		System.out.println("\t\tJanuary "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        
        System.out.println("\t\tFebruary "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        int l=28;
        if(leapyear) {
        	l=29;
        }
        for(i=1+d;i<=l+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;
        
        System.out.println("\t\tMarch "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tApril "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=30+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tMay "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tJune "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=30+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tJuly "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tAugust "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tSeptember "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=30+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tOctober "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tNovember "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=30+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
        System.out.println("\t\tDecember "+year);
		System.out.println("-----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(i=0;i<d;i++) {
        	System.out.print("\t");
        }
        for(i=1+d;i<=31+d;i++) {
        	if(i%7==0) {
        		System.out.println(i-d);//i-d代表输入数值，i代表这个月第几次输入
        	}else {
        		System.out.print(i-d + "\t");
        	}
        }
        System.out.println();
        d=(i-1)%7;//d代表下一月刚开始有几个空位
	}

}
