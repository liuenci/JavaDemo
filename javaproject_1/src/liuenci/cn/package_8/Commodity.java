package liuenci.cn.package_8;

public class Commodity {

	/**
	 * @param args
	 */
	String name;
	int code;
	double price;
	
	public Commodity(String name, int code, double price) {
		this.name = name ;
		this.code = code ;
		this.price = price ;
	}
	
	//��ӡ��Ʒ��Ϣ
	public void print() {
		System.out.println("����:"+name);
		System.out.println("����:"+code);
		System.out.println("��Ǯ:"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Commodity commodity = new Commodity("�Ϳ�", 10001, 1000);
		
		commodity.print();
		
	}

}
