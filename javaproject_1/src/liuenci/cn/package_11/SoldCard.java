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
	//Ĭ�Ϲ��췽��
	public SoldCard(){
		
	}
	
	//һ���������Ĺ��췽�����ø�����޲ε�Ĭ�Ϲ��췽�����ҳ�ʼ�����еĸ������� 
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
	//��д�����setCard������
	//�ڴ˷����е��ø����setCard������
	//�����ܹ���������ӵĸ������� 
	@Override
	public void setCard(long cardNumber, int password) {
		super.setCard(cardNumber, password);
	}
	
	//���һ������getPrice��
	//Ҫ��ֻ���Ѿ����ӵĿͻ����ܵ��ô˷�����
	//��ʾ���ø����е�getCard�����жϿͻ�������״̬ 
	public void getPrice(){
		super.getCard(154910381, 123);
	}
	//��д�����show����,
	//�ڴ˷����е��ø����show����������ʾ��������ӵ����ԡ�
	@Override
	public void show() {
		super.show();
		System.out.println("���ļ۸�:"+price);
		System.out.println("��������:"+reachYear);
		System.out.println("��������:"+reachMonth);
		System.out.println("��������:"+reachDay);
		System.out.println("�ͻ�����:"+clientName);
		System.out.println("��������:"+cardType);
		System.out.println("��������:"+date);
	}
	public static void main(String[] args) {
//		Card card = new Card(154910381,123,"1001",false);
//		card.setCard(154910381, 123);
//		card.getCard(154910381, 123);
		Card soldCard = new SoldCard(1.1,2011,2,11,"������","����",new Date());
		soldCard.setCard(154910381, 123);
		soldCard.getCard(154910381,123);
		soldCard.show();
	}

	

	

}
