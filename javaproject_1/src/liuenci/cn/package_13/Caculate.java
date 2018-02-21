package liuenci.cn.package_13;

import java.util.Scanner;

public class Caculate {
	double x;
	double y;
	double z;
	Scanner sc = new Scanner(System.in);

	/**
	 * 方法一：输入数字一
	 * @return 
	 */
	public double enter() {

		System.out.print("请输入数字一：");
		try {
			x = sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	/**
	 * 方法二：输入数字二
	 */
	public double enter2() {
		System.out.print("请输入数字二：");
		try {
			y = sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return y;
	}

	/**
	 * 方法三：两数之和
	 */
	public double add() {
		System.out.print("两数之和为：");
		try {
			System.out.println("z" + "=" +(x+y) );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * 方法四：两数之差
	 */
	public double subtract() {
		System.out.print("两数之差为：");
		try {
			System.out.println("z" + "=" + (x - y));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * 方法五：两数乘积
	 */
	public double multiply() {
		System.out.print("两数之乘为：");
		try {
			System.out.println("z" + "=" + (x * y));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * 方法六：两数相除
	 */
	public double eliminates() {
		System.out.print("两数相除为：");
		try {
			System.out.println("z" + "=" + (x / y));
		} catch (ArithmeticException e) {
			System.out.println("除数不为0");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

}
