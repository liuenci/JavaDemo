package liuenci.cn.package_4;

import java.util.Scanner;

public class PrintNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int []array=new int[10];
		for(int i=0;i<=4;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			array[i]=input.nextInt();
		}
		double average;
		int sum=0;
		for(int j=0;j<=4;j++){
			sum+=array[j];
		}
		average = sum/5;
		System.out.println("平均值是:"+average);
		for(int k=0;k<=4;k++){
			if(array[k]>average){
				System.out.println("arary["+k+"]="+array[k]);
			}
		}
	}

}
