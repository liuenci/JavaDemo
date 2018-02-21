package liuenci.cn.package_2;

import java.util.Scanner;

public class JudgeYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的年份：");
		int year = input.nextInt();
		if((year%4==0&&year/100!=0)||year%400==0){
			System.out.println(year+"是闰年");
		}
		else{
			System.out.println(year+"是平年");
		}
	}

}
