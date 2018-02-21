package liuenci.cn.package_7;

public class Goods {
	String name;//商品名称
	String code;//条码
	Double price;//价格
	String type;//分类
	
	void discount(){
		System.out.println("店庆十周年，全部商品一折卖");
	}
	
	void changeType(String type){
		this.type = type;
		System.out.println("现在商品的类型为:"+type);
	}
	
	void printInformation(String name,String code,Double price, String type){
		System.out.println("商品名:"+name);
		System.out.println("条码:"+code);
		System.out.println("价格:"+price);
		System.out.println("类型:"+type);
	}
}
