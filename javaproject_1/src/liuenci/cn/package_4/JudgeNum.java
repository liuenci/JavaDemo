package liuenci.cn.package_4;

import java.util.Scanner;
public class JudgeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int []array=new int[10];
		for(int i=0;i<=9;i++){
			System.out.print("请输入第"+(i+1)+"个数:");
			array[i]=input.nextInt();
		}
		int zero=0;
		int plus=0;
		int sub=0;
		for(int j=0;j<array.length;j++){
			if(array[j]==0){
				zero++;
			}
			else if(array[j]>0){
				plus++;
			}
			else{
				sub++;
			}
		}
		System.out.println("正数个数:"+plus);
		System.out.println("负数个数:"+sub);
		System.out.println("零的个数:"+zero);
	}

}
