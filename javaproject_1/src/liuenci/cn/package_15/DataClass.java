package liuenci.cn.package_15;

import java.util.Scanner;
import java.util.Calendar;
public class DataClass {
	public static void main(String[] args) {
		System.out.println("******万年历******");
		System.out.print("请输入您需要查找的年份:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		for(int i = 0;i < 12;i++){
			System.out.println("第"+(i+1)+"个月:");
			calendar.set(Calendar.MONTH, i);
			//设置日期为第一天
			calendar.set(Calendar.DATE, 1);
			//获取日期
			int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
			System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
			for(int j = 1-week;j<=calendar.getActualMaximum(Calendar.DATE);j++){
				if(j<=0){
					System.out.print(" \t");
				}else{
					System.out.print(j+"\t");
					if((j+week)%7==0){
						System.out.println();
					}
				}
				
			}
			System.out.println();
		}
	}
}
