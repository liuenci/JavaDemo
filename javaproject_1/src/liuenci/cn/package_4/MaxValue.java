package liuenci.cn.package_4;

import java.util.Scanner;

public class MaxValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int []array=new int[10];
		for(int i=0;i<=9;i++){
			System.out.print("�������"+(i+1)+"����:");
			array[i]=input.nextInt();
		}
		int maxValue=array[0];
		for(int i=0;i<=9;i++){
			if(array[i]>maxValue){
				maxValue=array[i+1];
			}
		}
		System.out.println("��������ֵ��:"+maxValue);
		
	}

}
