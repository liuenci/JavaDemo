package liuenci.cn.package_4;

import java.util.Scanner;

public class RepalceArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����������Ҫ������Ԫ�صĸ���:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int []array=new int[num];
		for(int i=0;i<array.length;i++){
			System.out.print("�������"+(i+1)+"����:");
			array[i] = input.nextInt();
		}
		
		//��ӡ����Ԫ��
		for(int j=0;j<array.length;j++){
			System.out.println("array["+j+"]="+array[j]);
		}
		
		//��תԪ��
		int half = array.length/2;
		for(int k = 0;k<=half;k++){
			int temp = array[k];
			array[k] = array[array.length-1];
			array[array.length-1] = array[k];
		}
		//��Ӧ��ת֮���Ԫ��
		for(int a = 0;a<array.length;a++){
			System.out.println("array["+a+"]="+array[a]);
		}
	}

}
