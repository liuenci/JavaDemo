package liuenci.cn.package_4;

import java.util.Scanner;

public class RepalceArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入你想要的数组元素的个数:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int []array=new int[num];
		for(int i=0;i<array.length;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			array[i] = input.nextInt();
		}
		
		//打印数组元素
		for(int j=0;j<array.length;j++){
			System.out.println("array["+j+"]="+array[j]);
		}
		
		//反转元素
		int half = array.length/2;
		for(int k = 0;k<=half;k++){
			int temp = array[k];
			array[k] = array[array.length-1];
			array[array.length-1] = array[k];
		}
		//答应反转之后的元素
		for(int a = 0;a<array.length;a++){
			System.out.println("array["+a+"]="+array[a]);
		}
	}

}
