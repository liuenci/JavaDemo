package liuenci.cn.package_4;

import java.util.Scanner;

public class Array {
	/**
	 * @����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []array=new int[5];
		for(int i=0;i<=4;i++){
			System.out.print("�������"+(i+1)+"����:");
			array[i]=input.nextInt();
		}
		System.out.println();
		for(int i=0;i<=4;i++){
			System.out.println("array["+i+"]"+"="+array[i]);
		}
		int minValue = array[0];
		for(int i=0;i<=4;i++){
			if(array[i]<minValue){
				minValue=array[i];
			}
		}
		//�������
		for(int j=array.length-1;j>=0;j--){
			System.out.println("array["+j+"]"+"="+array[j]);
		}
		System.out.println("�������Сֵ:"+minValue);
	}

}
