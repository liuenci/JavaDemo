package liuenci.cn.package_11;

import java.util.Date;

public class SoldCard extends Card{
	double price;
	int reachYear;
	int reachMonth;
	int reachDay;
	String clientName;
	String cardType;
	Date date;
	//默认构造方法
	public SoldCard(){
		
	}
	
	//一个带参数的构造方法调用父类的无参的默认构造方法并且初始化类中的各个属性 
	public SoldCard(double price,
			int reachYear, int reachMonth, int reachDay, String clientName, String cardType,Date date) {
		super();
		this.price = price;
		this.reachYear = reachYear;
		this.reachMonth = reachMonth;
		this.reachDay = reachDay;
		this.clientName = clientName;
		this.cardType = cardType;
		this.date = date;
	}
	//重写父类的setCard方法，
	//在此方法中调用父类的setCard方法，
	//并且能够设置新添加的各个属性 
	@Override
	public void setCard(long cardNumber, int password) {
		super.setCard(cardNumber, password);
	}
	
	//添加一个方法getPrice，
	//要求只有已经连接的客户才能调用此方法，
	//提示调用父类中的getCard方法判断客户的连接状态 
	public void getPrice(){
		super.getCard(154910381, 123);
	}
	//重写父类的show方法,
	//在此方法中调用父类的show方法，并显示其他新添加的属性。
	@Override
	public void show() {
		super.show();
		System.out.println("车的价格:"+price);
		System.out.println("出厂的年:"+reachYear);
		System.out.println("出厂的月:"+reachMonth);
		System.out.println("出厂的日:"+reachDay);
		System.out.println("客户名称:"+clientName);
		System.out.println("汽车类型:"+cardType);
		System.out.println("销售日期:"+date);
	}
	public static void main(String[] args) {
//		Card card = new Card(154910381,123,"1001",false);
//		card.setCard(154910381, 123);
//		card.getCard(154910381, 123);
		Card soldCard = new SoldCard(1.1,2011,2,11,"刘恩赐","宝马",new Date());
		soldCard.setCard(154910381, 123);
		soldCard.getCard(154910381,123);
		soldCard.show();
	}

	

	

}
