package liuenci.cn.package_15;

import java.util.Calendar;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("******������******");
		System.out.print("����������Ҫ��ѯ�����:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print("����������Ҫ��ѯ���·�:");
		int month = input.nextInt();
		Calendar calendar = Calendar.getInstance();
		//�������Ϊ��������
		calendar.set(Calendar.YEAR, year);
		//��Ϊһ���Ǵ�0��ʼ��
		calendar.set(Calendar.MONTH, month-1);
		//���������ǵ�һ��
		calendar.set(Calendar.DATE, 1);
		//����һ�������ڼ�
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");
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
