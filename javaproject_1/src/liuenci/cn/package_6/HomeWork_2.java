package liuenci.cn.package_6;

import java.util.Scanner;

public class HomeWork_2 {

	/**
	 * 输入N个同学的语、数、英三科成绩，计算他们的总分与平均分，
	 * 并统计出每个同学的名次，最后以表格的形式输出。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入想要输入成绩的同学的个数length:");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		double[][] output = new double[length][2];
		int[][] num = new int[length][3];
		String[] subject = {"数学","语文","英语"};
		for(int i=0;i<length;i++){
			for(int j = 0,a=0;j<3&&a<3;j++,a++){
				System.out.print("请输入第"+(i+1)+"个同学的"+subject[a]+":");
				num[i][j] = input.nextInt();
				output[i][0] +=num[i][j];
			}
			output[i][1] =(double)output[i][0]/3;
			System.out.println("========分割线=================");
		}
		System.out.println("同学                数学         语文         英语             总分             平均分");
		for(int i=0;i<length;i++){
			System.out.print("第"+i+"个同学"+"  ");
			for(int j=0;j<3;j++){
				System.out.print(num[i][j]+"    ");
			}
			for(int a=0;a<2;a++){
				System.out.print(output[i][a]+"    ");
			}
			System.out.println();
		}
	}

}
