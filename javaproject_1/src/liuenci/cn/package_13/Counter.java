package liuenci.cn.package_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
	int x,y;
	int z;
	
	//定义6个方法：（在每个方法中，进行对应的异常处理） 
	//方法一：输入数一 
	public double inputX(){
		System.out.println("请输入X的值:");
		Scanner input = new Scanner(System.in);
		try{
			x = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("请输入一个整数！");
		}	
		return x;
	}
	//方法二：输入数二 
	public double inputY(){
		System.out.println("请输入Y的值:");
		Scanner input = new Scanner(System.in);
		try{
			y = input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("请输入一个整数！");
		}	
		return y;
	}
	//方法三：实现加法 
	public void plus(){
		try{
			System.out.println("x+y="+(x+y));
		}catch(Exception e){
			System.out.println("有异常！");
		}
	}
	//方法四：实现减法 
	public void  subtraction(){
		try{
			System.out.println("x-y="+(x-y));
		}catch(Exception e){
			System.out.println("有异常！");
		}
	}
	//方法五：实现乘法 
	public void  multiplication(){
		try{
			System.out.println("x*y="+(x*y));
		}catch(Exception e){
			System.out.println("有异常！");
		}
	}
	//方法六：实现除法 
	public void  division(){
		try{
			System.out.println("x/y="+(x/y));
		}catch(Exception e){
			System.out.println("有异常！");
		}
	}
}
