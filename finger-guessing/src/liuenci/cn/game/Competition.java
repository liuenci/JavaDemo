package liuenci.cn.game;

import java.util.Scanner;

public class Competition {
	String[] type = {"ʯͷ","����","��"};
	int uSum = 0;
	int compuSum = 0;
	int time = 0;

	String compuType = type[(int)(Math.random()*10000%3)];
	//��ʼ��ȭ
	public void compete(IntroduceInformation introduceInformation){
		System.out.println("1.ʯͷ 2.���� 3.��");
		for(int i=0;i<10000;i++){
			System.out.println("���ȭ:");
			Scanner input = new Scanner(System.in);
			String uType = input.next();
			System.out.println("�˻���ȭ:"+compuType);
			
			if((uType.equals("ʯͷ")&&compuType.equals("����"))||
					(uType.equals("����")&&compuType.equals("��"))||
					(uType.equals("��")&&compuType.equals("ʯͷ"))){
				System.out.println("���:��ϲ,��Ӯ�ˡ�");
				uSum++;
				time++;
				System.out.println("�Ƿ�ʼ��һ��(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs" + introduceInformation.getMatch());
					System.out.println("��ս����:"+time);
					System.out.println();
					System.out.println("����\t�÷�");
					System.out.println(introduceInformation.getName()+"\t"+uSum);
					System.out.println(introduceInformation.getMatch()+"\t"+compuSum);
					System.out.println("��ϲ��ϲ,�Ƿ������һ��(y/n)");
					char operateEnd = input.next().charAt(0);
					if(operateEnd=='y'){
						continue;
					}
					else{
						System.out.println("��Ϸ�����������˳�!");
						System.exit(0);
					}
				}
			}
			else if((uType.equals("ʯͷ")&&compuType.equals("ʯͷ"))||
					(uType.equals("����")&&compuType.equals("����"))||(uType.equals("��")&&compuType.equals("��"))){
				System.out.println("���:����ƽ�֡�");
				time++;
				System.out.println("�Ƿ�ʼ��һ��(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs"+introduceInformation.getMatch());
					System.out.println("��ս����:"+time);
					System.out.println();
					System.out.println("����\t�÷�");
					System.out.println(introduceInformation.getName()+"\t"+uSum);
					System.out.println(introduceInformation.getMatch()+"\t"+compuSum);
					break;
				}
			}
			else{
				System.out.println("���:�����ˡ�");
				compuSum++;
				time++;
				System.out.println("�Ƿ�ʼ��һ��(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs"+ introduceInformation.getMatch());
					System.out.println("��ս����:"+time);
					System.out.println();
					System.out.println("����\t�÷�");
					System.out.println(introduceInformation.getName() +"\t"+uSum);
					System.out.println(introduceInformation.getMatch() +"\t"+compuSum);
					break;
				}
			}
		}
		
	}
}
