package liuenci.cn.game;

import java.util.Scanner;

public class Competition {
	String[] type = {"石头","剪刀","布"};
	int uSum = 0;
	int compuSum = 0;
	int time = 0;

	String compuType = type[(int)(Math.random()*10000%3)];
	//开始猜拳
	public void compete(IntroduceInformation introduceInformation){
		System.out.println("1.石头 2.剪刀 3.布");
		for(int i=0;i<10000;i++){
			System.out.println("你出拳:");
			Scanner input = new Scanner(System.in);
			String uType = input.next();
			System.out.println("人机出拳:"+compuType);
			
			if((uType.equals("石头")&&compuType.equals("剪刀"))||
					(uType.equals("剪刀")&&compuType.equals("布"))||
					(uType.equals("布")&&compuType.equals("石头"))){
				System.out.println("结果:恭喜,你赢了。");
				uSum++;
				time++;
				System.out.println("是否开始下一轮(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs" + introduceInformation.getMatch());
					System.out.println("对战次数:"+time);
					System.out.println();
					System.out.println("姓名\t得分");
					System.out.println(introduceInformation.getName()+"\t"+uSum);
					System.out.println(introduceInformation.getMatch()+"\t"+compuSum);
					System.out.println("恭喜恭喜,是否进行下一局(y/n)");
					char operateEnd = input.next().charAt(0);
					if(operateEnd=='y'){
						continue;
					}
					else{
						System.out.println("游戏结束，程序退出!");
						System.exit(0);
					}
				}
			}
			else if((uType.equals("石头")&&compuType.equals("石头"))||
					(uType.equals("剪刀")&&compuType.equals("剪刀"))||(uType.equals("布")&&compuType.equals("布"))){
				System.out.println("结果:两人平手。");
				time++;
				System.out.println("是否开始下一轮(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs"+introduceInformation.getMatch());
					System.out.println("对战次数:"+time);
					System.out.println();
					System.out.println("姓名\t得分");
					System.out.println(introduceInformation.getName()+"\t"+uSum);
					System.out.println(introduceInformation.getMatch()+"\t"+compuSum);
					break;
				}
			}
			else{
				System.out.println("结果:你输了。");
				compuSum++;
				time++;
				System.out.println("是否开始下一轮(y/n)");
				char operate = input.next().charAt(0);
				if(operate=='y'){
					continue;
				}
				else{
					System.out.println(introduceInformation.getName()+"vs"+ introduceInformation.getMatch());
					System.out.println("对战次数:"+time);
					System.out.println();
					System.out.println("姓名\t得分");
					System.out.println(introduceInformation.getName() +"\t"+uSum);
					System.out.println(introduceInformation.getMatch() +"\t"+compuSum);
					break;
				}
			}
		}
		
	}
}
