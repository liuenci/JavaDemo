package liuenci.cn.package_6;

import java.util.Scanner;

public class HomeWork_1 {

	/**
	 * 方阵转换：输入一个N*N的方阵，要求进行转换，
	 * 将左上半部的数与右下半部的数对换，例如n=5 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入你想要的生成的方阵行列N:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][] array = new int[num][num];
		//随机生成二元数组元素并打印出来
		System.out.println("改变前:");
		for(int i=0;i<array.length;i++){
			//内层循环
			for(int j = 0;j<array[i].length;j++){
				array[i][j] = (int)(Math.random()*100);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		//对换数字并打印
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array[i].length;j++){
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		System.out.println("倒序后:");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
