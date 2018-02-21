package liuenci.cn.package_15;

import java.util.Calendar;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("******万年历******");
		System.out.print("请输入您需要查询的年份:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("请输入您需要查询的月份:");
		int month = input.nextInt();
		Calendar calendar = Calendar.getInstance();
		//设置年份为输入的年份
		calendar.set(Calendar.YEAR, year);
		//因为一月是从0开始的
		calendar.set(Calendar.MONTH, month-1);
		//设置日期是第一天
		calendar.set(Calendar.DATE, 1);
		//计算一号是星期几
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		for(int j = 1-week;j<=calendar.getActualMaximum(Calendar.DATE);j++){
			if(j<=0){
				System.out.print(" \t");
			} else{
				System.out.print(j+"\t");
				if((j+week)%7==0){
					System.out.println();
				}
			}
			
		}
	}

}
