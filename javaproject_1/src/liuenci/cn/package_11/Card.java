package liuenci.cn.package_11;

public class Card {
	//����
	private long cardNumber;
	//����
	private int password;
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	//���ӿ���
	String connectNumber;
	//���ӱ�־
	boolean connectFlag;
	public String getConnectNumber() {
		return connectNumber;
	}
	public void setConnectNumber(String connectNumber) {
		this.connectNumber = connectNumber;
	}
	public boolean isConnectFlag() {
		return connectFlag;
	}
	public void setConnectFlag(boolean connectFlag) {
		this.connectFlag = connectFlag;
	}
	//���ι��췽��
	public Card(long cardNumber, int password, String connectNumber, boolean connectFlag) {
		this.cardNumber = cardNumber;
		this.password = password;
		this.connectNumber = connectNumber;
		this.connectFlag = connectFlag;
	}
	//�޲ι��췽��
	public Card(){
		
	}
	//һ������setCard���ÿ��Ŀ��ź�����
	public void setCard(long cardNumber,int password){
		setCardNumber(cardNumber);
		setPassword(password);
	}
	
	//һ������getCard���뿨�ź������ֵ���ж��Ƿ��ܹ�����
	public void getCard(long cn,int pw){
		if(getCardNumber()==cn&&getPassword()==pw){
			setConnectFlag(true);
		}
	}
	
	//һ������show����ʾ��������״̬�����š����롢���ӿ��� 
	public void show(){
		System.out.println("����״̬:"+isConnectFlag());
		System.out.println("����:"+getCardNumber());
		System.out.println("����:"+getPassword());
		System.out.println("���ӿ���:"+getConnectNumber());
	}
}
