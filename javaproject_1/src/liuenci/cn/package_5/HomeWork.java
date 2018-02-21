package liuenci.cn.package_5;

import java.util.Scanner;

public class HomeWork {

	/**
	 * 制作一份小学数学试卷，做完得出成绩
	 */
	public static void main(String[] args) {
		HomeWork t = new HomeWork();
		System.out.println("欢迎来到考试教育系统,你是否有勇气继续挑战(y/n)");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		if(a.equals("y")){
			System.out.println("===欢迎进入考试系统===");
			System.out.println("请开始你的作答");
			t.test();
		}
		else{
			System.out.println("你应该更自信的尝试。");
		}
	}
	public void test(){
		int sum = 0;
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			System.out.println("第"+i+"道题:");
			System.out.print(a+"+"+b+"=");
			Scanner input = new Scanner(System.in);
			int c = input.nextInt();
			if(c==(a+b)){
				sum++;
			}
		}
		System.out.println("你的最后得分为:"+sum*10);
	}
}
