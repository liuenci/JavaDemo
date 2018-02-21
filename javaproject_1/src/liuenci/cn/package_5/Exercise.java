package liuenci.cn.package_5;

import java.util.Scanner;

public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise value = new Exercise();
//		System.out.println("该数的阶乘是:"+value.jieCheng());
		value.arraySort();
	}
//	public int jieCheng(){
//		System.out.println("请输入阶乘的数:");
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		int fact=1;
//		for(int i= 1;i<=num;i++){
//			fact=fact*i;
//		}
//		return fact;
//	}
	public void arraySort(){
		System.out.println("请输入数组元素的个数:");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int []array=new int[num];
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"个元素的值:");
			array[i]=input.nextInt();
		}
		System.out.println("请输入标记元素的布尔值:");
		boolean sign=input.nextBoolean();
		if(sign){
			for(int i=0;i<array.length;i++){
				System.out.println("array["+"]="+array[i]);
			}
		}
		else{
			for(int j=array.length-1;j>=0;j--){
				System.out.println("array["+j+"]="+array[j]);
			}
		}
	}
}
