package liuenci.cn.package_4;

import java.util.Scanner;

public class HomeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand[] = new int[5];
		for(int i=0;i<5;i++){
			rand[i]=(int)(Math.random()*10);
			System.out.println("rand["+i+"]="+rand[i]);
		}
		System.out.println("������һ����:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int k=0;k<5;k++){
			if(rand[k]==num){
				System.out.println("�����������е��±�Ϊ:"+k);
			}
			else{
				System.out.println("û����Ҫ�ҵ�����!");
				break;
			}
		}
	}

}
