package liuenci.cn.package_5;

import java.util.Scanner;

public class HomeWork {

	/**
	 * ����һ��Сѧ��ѧ�Ծ�����ó��ɼ�
	 */
	public static void main(String[] args) {
		HomeWork t = new HomeWork();
		System.out.println("��ӭ�������Խ���ϵͳ,���Ƿ�������������ս(y/n)");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		if(a.equals("y")){
			System.out.println("===��ӭ���뿼��ϵͳ===");
			System.out.println("�뿪ʼ�������");
			t.test();
		}
		else{
			System.out.println("��Ӧ�ø����ŵĳ��ԡ�");
		}
	}
	public void test(){
		int sum = 0;
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			System.out.println("��"+i+"����:");
			System.out.print(a+"+"+b+"=");
			Scanner input = new Scanner(System.in);
			int c = input.nextInt();
			if(c==(a+b)){
				sum++;
			}
		}
		System.out.println("������÷�Ϊ:"+sum*10);
	}
}
