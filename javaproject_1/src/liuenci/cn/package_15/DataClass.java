package liuenci.cn.package_15;

import java.util.Scanner;
import java.util.Calendar;
public class DataClass {
	public static void main(String[] args) {
		System.out.println("******������******");
		System.out.print("����������Ҫ���ҵ����:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		for(int i = 0;i < 12;i++){
			System.out.println("��"+(i+1)+"����:");
			calendar.set(Calendar.MONTH, i);
			//��������Ϊ��һ��
			calendar.set(Calendar.DATE, 1);
			//��ȡ����
			int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
			System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");
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
