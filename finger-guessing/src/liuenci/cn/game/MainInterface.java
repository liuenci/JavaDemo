package liuenci.cn.game;

public class MainInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ӭ����
		//����Գ��ս��԰����
		WelcomeInterface welcomeInterface = new WelcomeInterface();
		welcomeInterface.surface();
		
		//����ѡ�ֽ���
		IntroduceInformation infor = new IntroduceInformation();
		infor.information();



	}
	

}
