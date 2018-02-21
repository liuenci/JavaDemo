package liuenci.cn.game;

public class MainInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//欢迎界面
		//程序猿大战桃园三侠
		WelcomeInterface welcomeInterface = new WelcomeInterface();
		welcomeInterface.surface();
		
		//介绍选手界面
		IntroduceInformation infor = new IntroduceInformation();
		infor.information();



	}
	

}
