package liuenci.cn.package_3;

import java.util.Scanner;

public class LuckyChoosen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = null;
		String password = null;
		System.out.println("**********��ӭ���뽱�͸���ϵͳ**********");
		System.out.println("                     1.ע��");
		System.out.println("                     2.��½");
		System.out.println("                     3.�齱");
		System.out.println("*****************************************");
		System.out.println("��ѡ��˵���");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("�����͸���ϵͳ >ע�᡿");
			System.out.println("����Ҫ����������(y/n)");
			char operate=input.next().charAt(0);
			if(operate=='y'){
				System.out.println("**********��ӭ���뽱�͸���ϵͳ**********");
				System.out.println("                     1.ע��");
				System.out.println("                     2.��½");
				System.out.println("                     3.�齱");
				System.out.println("*****************************************");
				System.out.println("��ѡ��˵���");
				num=input.nextInt();
				switch(num){
					case 1:
					System.out.println("�������û���Ϣ��");
					System.out.println("�û�����");
					userName=input.next();
					System.out.println("���룺");
					password=input.next();
					System.out.println("�û���   ����   ��Ա����");
					int x=(int)(Math.random()*9000+1000);
					System.out.println(userName+" "+password+" "+x);
					System.out.println("������(y/n)");
					char operate_1=input.next().charAt(0);
					if(operate_1=='y'){
						System.out.println("**********��ӭ���뽱�͸���ϵͳ**********");
						System.out.println("                     1.ע��");
						System.out.println("                     2.��½");
						System.out.println("                     3.�齱");
						System.out.println("*****************************************");
						System.out.println("��ѡ��˵���");
						int num_1=input.nextInt();
						switch(num_1){
							case 1:
								System.out.println("���Ѿ�ע����ˣ���ֱ�ӵ�½");
								break;
							case 2:
								for(int i=1;i<=3;i++){
									System.out.print("�������û���:");
					   				String inputUserName=input.next();
									System.out.print("����������:");
									String inputPassword=input.next();
									if(inputUserName.equals(userName)&&inputPassword.equals(password)){
										System.out.print("��ӭ��"+inputUserName);
										System.out.println();
										System.out.println("������(y/n)");
										char operate_2=input.next().charAt(0);
										if(operate_2=='y'){
											System.out.println("**********��ӭ���뽱�͸���ϵͳ**********");
											System.out.println("                     1.ע��");
											System.out.println("                     2.��½");
											System.out.println("                     3.�齱");
											System.out.println("*****************************************");
											System.out.println("��ѡ��˵���");
											int num_2=input.nextInt();
											switch(num_2){
												case 1:
													System.out.println("���Ѿ�ע�������ֱ�ӵ�½");	
													break;
												case 2:
													System.out.println("���Ѿ���½������ֱ�ӳ齱");
													break;
												case 3:
													System.out.println("�����͸���ϵͳ >�齱");
													System.out.println("��������Ļ�Ա����:");
													int y = input.nextInt();
													if(x==y){
														int[] luckyNum = new int[5];
														for(int a=0;a<luckyNum.length;a++){
															luckyNum[a] = (int)(Math.random()*10000);
														}
														System.out.print("���յ�����������:");
														for(int a=0;a<luckyNum.length;a++){
															System.out.print(luckyNum[a]+" ");
														}
														System.out.println();
														for(int a=0;a<luckyNum.length;a++){
															if(y==luckyNum[a]){
																System.out.println("��ϲ�㣬��Ϊ��������֮�ǣ�");
															}
															else{
																System.out.println("��Ǹ����������Ե");
																break;
															}
														}
													}
													break;
												default:
													System.out.println("�������");
													break;
											}
										}
									}
									else{
										System.out.println("�û������������������������");
									}
									break;
								}
								break;
						}
					}
					else if(operate_1=='n'){
						System.out.print("ллʹ�ã��˳�ϵͳ��");
					}
					else{
							System.out.println("�������");
						}
					}	
				}
				else if(operate=='n'){
					System.out.println("ллʹ�ã��˳�ϵͳ��");
				}
				else{
					System.out.println("�������");
				}
			break;
		case 2:
			System.out.println("�����͸���ϵͳ >��½");
			for(int i=1;i<=3;i++){
				System.out.print("�������û���:");
				String inputUserName=input.next();
				System.out.print("����������:");
				String inputPassword=input.next();
				
				if(inputUserName.equals(userName)&&inputPassword.equals(password)){
					System.out.print("��ӭ��"+inputUserName);
				}
				else{
					System.out.println("�û������������������������");
				}
			}
			break;
		case 3:
			System.out.println("�����͸���ϵͳ >�齱");
			break;
		default:
			System.out.println("��������������");
			break;
		}
	}
	
			


}
