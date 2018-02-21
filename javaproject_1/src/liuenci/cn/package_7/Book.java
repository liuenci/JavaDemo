package liuenci.cn.package_7;
/*
 * 请定义一个类，用于描述图书特征
 * 书名、定价、销售折扣、作者、页数、成本
 * 行为
 * 计算印刷纸张数
 * 计算打折后的价格
 * 计算利润
 * 打印图书的详细信息 
 */
public class Book {
	String name;
	double price;
	double discount;
	String author;
	int pageNumber;
	double cost;
	
	public void printNumber(int pageNumber){
		System.out.println("印刷纸张数:"+pageNumber);
	}
	
	public void discountPrice(double price,double discount){
		System.out.println("打折之后的价格为:"+(price*discount/10)); //比如说7.5折那就按0.75计算，所以这里要除以10
	}
	
	public void profit(double  price,double discount,double cost){
		System.out.println("利润:"+(price*discount/10-cost));
	}
	
	public void printInformation(String name,double price,
			double discount,String author,int pageNumber,double cost){
		System.out.println("图书名字:"+name);
		System.out.println("图书价格:"+price);
		System.out.println("图书折扣:"+discount);
		System.out.println("图书作者:"+author);
		System.out.println("图书页数:"+pageNumber);
	}
}
