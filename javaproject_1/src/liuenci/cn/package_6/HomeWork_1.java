package liuenci.cn.package_6;

import java.util.Scanner;

public class HomeWork_1 {

	/**
	 * ����ת��������һ��N*N�ķ���Ҫ�����ת����
	 * �����ϰ벿���������°벿�����Ի�������n=5 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����������Ҫ�����ɵķ�������N:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][] array = new int[num][num];
		//������ɶ�Ԫ����Ԫ�ز���ӡ����
		System.out.println("�ı�ǰ:");
		for(int i=0;i<array.length;i++){
			//�ڲ�ѭ��
			for(int j = 0;j<array[i].length;j++){
				array[i][j] = (int)(Math.random()*100);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		//�Ի����ֲ���ӡ
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array[i].length;j++){
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		System.out.println("�����:");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
