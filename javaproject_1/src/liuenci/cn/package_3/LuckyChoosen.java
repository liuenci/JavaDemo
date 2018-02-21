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
		System.out.println("**********欢迎进入奖客富翁系统**********");
		System.out.println("                     1.注册");
		System.out.println("                     2.登陆");
		System.out.println("                     3.抽奖");
		System.out.println("*****************************************");
		System.out.println("请选择菜单：");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("【奖客富翁系统 >注册】");
			System.out.println("您需要继续操作吗？(y/n)");
			char operate=input.next().charAt(0);
			if(operate=='y'){
				System.out.println("**********欢迎进入奖客富翁系统**********");
				System.out.println("                     1.注册");
				System.out.println("                     2.登陆");
				System.out.println("                     3.抽奖");
				System.out.println("*****************************************");
				System.out.println("请选择菜单：");
				num=input.nextInt();
				switch(num){
					case 1:
					System.out.println("请输入用户信息：");
					System.out.println("用户名：");
					userName=input.next();
					System.out.println("密码：");
					password=input.next();
					System.out.println("用户名   密码   会员卡号");
					int x=(int)(Math.random()*9000+1000);
					System.out.println(userName+" "+password+" "+x);
					System.out.println("继续吗？(y/n)");
					char operate_1=input.next().charAt(0);
					if(operate_1=='y'){
						System.out.println("**********欢迎进入奖客富翁系统**********");
						System.out.println("                     1.注册");
						System.out.println("                     2.登陆");
						System.out.println("                     3.抽奖");
						System.out.println("*****************************************");
						System.out.println("请选择菜单：");
						int num_1=input.nextInt();
						switch(num_1){
							case 1:
								System.out.println("您已经注册过了，请直接登陆");
								break;
							case 2:
								for(int i=1;i<=3;i++){
									System.out.print("请输入用户名:");
					   				String inputUserName=input.next();
									System.out.print("请输入密码:");
									String inputPassword=input.next();
									if(inputUserName.equals(userName)&&inputPassword.equals(password)){
										System.out.print("欢迎您"+inputUserName);
										System.out.println();
										System.out.println("继续吗？(y/n)");
										char operate_2=input.next().charAt(0);
										if(operate_2=='y'){
											System.out.println("**********欢迎进入奖客富翁系统**********");
											System.out.println("                     1.注册");
											System.out.println("                     2.登陆");
											System.out.println("                     3.抽奖");
											System.out.println("*****************************************");
											System.out.println("请选择菜单：");
											int num_2=input.nextInt();
											switch(num_2){
												case 1:
													System.out.println("你已经注册过，请直接登陆");	
													break;
												case 2:
													System.out.println("你已经登陆过，请直接抽奖");
													break;
												case 3:
													System.out.println("【奖客富翁系统 >抽奖");
													System.out.println("请输入你的会员卡号:");
													int y = input.nextInt();
													if(x==y){
														int[] luckyNum = new int[5];
														for(int a=0;a<luckyNum.length;a++){
															luckyNum[a] = (int)(Math.random()*10000);
														}
														System.out.print("今日的幸运数字是:");
														for(int a=0;a<luckyNum.length;a++){
															System.out.print(luckyNum[a]+" ");
														}
														System.out.println();
														for(int a=0;a<luckyNum.length;a++){
															if(y==luckyNum[a]){
																System.out.println("恭喜你，成为本次幸运之星！");
															}
															else{
																System.out.println("抱歉，大奖与你无缘");
																break;
															}
														}
													}
													break;
												default:
													System.out.println("输入错误！");
													break;
											}
										}
									}
									else{
										System.out.println("用户名或者密码错误，请重新输入");
									}
									break;
								}
								break;
						}
					}
					else if(operate_1=='n'){
						System.out.print("谢谢使用，退出系统！");
					}
					else{
							System.out.println("输入错误。");
						}
					}	
				}
				else if(operate=='n'){
					System.out.println("谢谢使用，退出系统！");
				}
				else{
					System.out.println("输入错误");
				}
			break;
		case 2:
			System.out.println("【奖客富翁系统 >登陆");
			for(int i=1;i<=3;i++){
				System.out.print("请输入用户名:");
				String inputUserName=input.next();
				System.out.print("请输入密码:");
				String inputPassword=input.next();
				
				if(inputUserName.equals(userName)&&inputPassword.equals(password)){
					System.out.print("欢迎您"+inputUserName);
				}
				else{
					System.out.println("用户名或者密码错误，请重新输入");
				}
			}
			break;
		case 3:
			System.out.println("【奖客富翁系统 >抽奖");
			break;
		default:
			System.out.println("【您的输入有误】");
			break;
		}
	}
	
			


}
