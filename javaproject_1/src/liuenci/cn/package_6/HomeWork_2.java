package liuenci.cn.package_6;

import java.util.Scanner;

public class HomeWork_2 {

	/**
	 * ����N��ͬѧ�������Ӣ���Ƴɼ����������ǵ��ܷ���ƽ���֣�
	 * ��ͳ�Ƴ�ÿ��ͬѧ�����Σ�����Ա�����ʽ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("��������Ҫ����ɼ���ͬѧ�ĸ���length:");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		double[][] output = new double[length][2];
		int[][] num = new int[length][3];
		String[] subject = {"��ѧ","����","Ӣ��"};
		for(int i=0;i<length;i++){
			for(int j = 0,a=0;j<3&&a<3;j++,a++){
				System.out.print("�������"+(i+1)+"��ͬѧ��"+subject[a]+":");
				num[i][j] = input.nextInt();
				output[i][0] +=num[i][j];
			}
			output[i][1] =(double)output[i][0]/3;
			System.out.println("========�ָ���=================");
		}
		System.out.println("ͬѧ                ��ѧ         ����         Ӣ��             �ܷ�             ƽ����");
		for(int i=0;i<length;i++){
			System.out.print("��"+i+"��ͬѧ"+"  ");
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
