package liuenci.cn.package_13;

import java.util.Scanner;

public class Caculate {
	double x;
	double y;
	double z;
	Scanner sc = new Scanner(System.in);

	/**
	 * ����һ����������һ
	 * @return 
	 */
	public double enter() {

		System.out.print("����������һ��");
		try {
			x = sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x;
	}

	/**
	 * ���������������ֶ�
	 */
	public double enter2() {
		System.out.print("���������ֶ���");
		try {
			y = sc.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return y;
	}

	/**
	 * ������������֮��
	 */
	public double add() {
		System.out.print("����֮��Ϊ��");
		try {
			System.out.println("z" + "=" +(x+y) );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * �����ģ�����֮��
	 */
	public double subtract() {
		System.out.print("����֮��Ϊ��");
		try {
			System.out.println("z" + "=" + (x - y));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * �����壺�����˻�
	 */
	public double multiply() {
		System.out.print("����֮��Ϊ��");
		try {
			System.out.println("z" + "=" + (x * y));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

	/**
	 * ���������������
	 */
	public double eliminates() {
		System.out.print("�������Ϊ��");
		try {
			System.out.println("z" + "=" + (x / y));
		} catch (ArithmeticException e) {
			System.out.println("������Ϊ0");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return z;
	}

}
