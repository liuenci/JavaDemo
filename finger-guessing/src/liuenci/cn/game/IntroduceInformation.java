package liuenci.cn.game;

import java.util.Scanner;



public class IntroduceInformation {
	String[] role = {"����","��Ȩ","�ܲ�"};
	private String  match;
	private String name;

	//match��name��setter��getter����
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void information(){
		//����������ó�Ա����
		IntroduceInformation introduceInformation = new IntroduceInformation();
		System.out.println("��Ķ����� 1.���� 2.��Ȩ 3.�ܲ�");
		System.out.print("����������Ҫѡ��Ķ��ֵ����:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		switch(num){
		case 1:
			introduceInformation.setMatch(role[0]);
			break;
		case 2:
            introduceInformation.setMatch(role[0]);
			break;
		case 3:
            introduceInformation.setMatch(role[0]);
			break;
		default:
			System.out.println("û���������!");
            System.out.println("�����˳�!");
			System.exit(0);
			break;
		}
		
		System.out.print("�������������:");
		introduceInformation.setName(input.next());
		//name = input.next();
		
		//��ս
		System.out.println(introduceInformation.getName()+" vs "+introduceInformation.getMatch());
		
		System.out.println("׼������"+introduceInformation.getMatch()+"��ɱ���ٻغ�����(y/n)");
		char operate = input.next().charAt(0);
		if(operate == 'y'){
			//����
			Competition competition = new Competition();
			competition.compete(introduceInformation);
		} else if (operate == 'n') {
			System.out.println("you can have a try!");
			System.exit(0);
		} else {
			System.out.println("û����������ģ�");
			System.out.println("�����˳�");
			System.exit(0);
		}
	}
}
