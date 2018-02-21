package liuenci.cn.game;

import java.util.Scanner;



public class IntroduceInformation {
	String[] role = {"刘备","孙权","曹操"};
	private String  match;
	private String name;

	//match和name的setter和getter方法
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
		//创建对象调用成员属性
		IntroduceInformation introduceInformation = new IntroduceInformation();
		System.out.println("你的对手有 1.刘备 2.孙权 3.曹操");
		System.out.print("请输入你想要选择的对手的序号:");
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
			System.out.println("没有这个对手!");
            System.out.println("程序退出!");
			System.exit(0);
			break;
		}
		
		System.out.print("请输入你的姓名:");
		introduceInformation.setName(input.next());
		//name = input.next();
		
		//对战
		System.out.println(introduceInformation.getName()+" vs "+introduceInformation.getMatch());
		
		System.out.println("准备好与"+introduceInformation.getMatch()+"屠杀三百回合了吗？(y/n)");
		char operate = input.next().charAt(0);
		if(operate == 'y'){
			//比赛
			Competition competition = new Competition();
			competition.compete(introduceInformation);
		} else if (operate == 'n') {
			System.out.println("you can have a try!");
			System.exit(0);
		} else {
			System.out.println("没有这个操作的！");
			System.out.println("程序退出");
			System.exit(0);
		}
	}
}
