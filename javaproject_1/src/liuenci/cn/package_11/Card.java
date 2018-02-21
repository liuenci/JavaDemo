package liuenci.cn.package_11;

public class Card {
	//卡号
	private long cardNumber;
	//密码
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

	//连接卡号
	String connectNumber;
	//连接标志
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
	//带参构造方法
	public Card(long cardNumber, int password, String connectNumber, boolean connectFlag) {
		this.cardNumber = cardNumber;
		this.password = password;
		this.connectNumber = connectNumber;
		this.connectFlag = connectFlag;
	}
	//无参构造方法
	public Card(){
		
	}
	//一个方法setCard设置卡的卡号和密码
	public void setCard(long cardNumber,int password){
		setCardNumber(cardNumber);
		setPassword(password);
	}
	
	//一个方法getCard传入卡号和密码的值来判断是否能够连接
	public void getCard(long cn,int pw){
		if(getCardNumber()==cn&&getPassword()==pw){
			setConnectFlag(true);
		}
	}
	
	//一个方法show来显示卡的连接状态、卡号、密码、连接卡号 
	public void show(){
		System.out.println("连接状态:"+isConnectFlag());
		System.out.println("卡号:"+getCardNumber());
		System.out.println("密码:"+getPassword());
		System.out.println("连接卡号:"+getConnectNumber());
	}
}
