package liuenci.cn.package_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
	int x,y;
	int z;
	
	//����6������������ÿ�������У����ж�Ӧ���쳣���� 
	//����һ��������һ 
	public double inputX(){
		System.out.println("������X��ֵ:");
		Scanner input = new Scanner(System.in);
		try{
			x = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("������һ��������");
		}	
		return x;
	}
	//���������������� 
	public double inputY(){
		System.out.println("������Y��ֵ:");
		Scanner input = new Scanner(System.in);
		try{
			y = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("������һ��������");
		}	
		return y;
	}
	//��������ʵ�ּӷ� 
	public void plus(){
		try{
			System.out.println("x+y="+(x+y));
		}catch(Exception e){
			System.out.println("���쳣��");
		}
	}
	//�����ģ�ʵ�ּ��� 
	public void  subtraction(){
		try{
			System.out.println("x-y="+(x-y));
		}catch(Exception e){
			System.out.println("���쳣��");
		}
	}
	//�����壺ʵ�ֳ˷� 
	public void  multiplication(){
		try{
			System.out.println("x*y="+(x*y));
		}catch(Exception e){
			System.out.println("���쳣��");
		}
	}
	//��������ʵ�ֳ��� 
	public void  division(){
		try{
			System.out.println("x/y="+(x/y));
		}catch(Exception e){
			System.out.println("���쳣��");
		}
	}
}
