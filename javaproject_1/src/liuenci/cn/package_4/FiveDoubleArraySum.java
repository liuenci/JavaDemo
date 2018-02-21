package liuenci.cn.package_4;

import java.util.Scanner;

public class FiveDoubleArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double []array=new double[5];
		for(int i=0;i<=4;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			array[i]=input.nextDouble();
		}
		//正序输出
		System.out.println();
		for(int i=0;i<=4;i++){
			System.out.println("array["+i+"]"+"="+array[i]);
		}
		
		double sum=0;
		for(int i=0;i<=4;i++){
			sum+=array[i];
		}
		System.out.println("五个数组元素的和:"+sum);
	}

}
