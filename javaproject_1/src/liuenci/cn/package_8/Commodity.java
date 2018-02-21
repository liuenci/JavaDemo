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
	
	//打印商品信息
	public void print() {
		System.out.println("名字:"+name);
		System.out.println("条码:"+code);
		System.out.println("价钱:"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Commodity commodity = new Commodity("耐克", 10001, 1000);
		
		commodity.print();
		
	}

}
