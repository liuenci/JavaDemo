package liuenci.cn.package_3;

import java.util.Scanner;

public class Recycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	for(int i=0;i<4;i++){
			//循环输出空格
			for(int j=1;j<=3-i;j++){
				System.out.print(" ");
			}
			//循环输出*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		/*for(int i=1;i<=4;i++){
			//循环输出空格
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			//循环输出*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--){
			//循环输出空格
			for(int j=1;j<=7-2*i ;j++){
				System.out.print(" ");
			}
			//循环输出*
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for(int i=1;i<=4;i++){
			//循环输出空格
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
