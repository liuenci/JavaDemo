package liuenci.cn.package_7;
/*
 * �붨��һ���࣬��������ͼ������
 * ���������ۡ������ۿۡ����ߡ�ҳ�����ɱ�
 * ��Ϊ
 * ����ӡˢֽ����
 * ������ۺ�ļ۸�
 * ��������
 * ��ӡͼ�����ϸ��Ϣ 
 */
public class Book {
	String name;
	double price;
	double discount;
	String author;
	int pageNumber;
	double cost;
	
	public void printNumber(int pageNumber){
		System.out.println("ӡˢֽ����:"+pageNumber);
	}
	
	public void discountPrice(double price,double discount){
		System.out.println("����֮��ļ۸�Ϊ:"+(price*discount/10)); //����˵7.5���ǾͰ�0.75���㣬��������Ҫ����10
	}
	
	public void profit(double  price,double discount,double cost){
		System.out.println("����:"+(price*discount/10-cost));
	}
	
	public void printInformation(String name,double price,
			double discount,String author,int pageNumber,double cost){
		System.out.println("ͼ������:"+name);
		System.out.println("ͼ��۸�:"+price);
		System.out.println("ͼ���ۿ�:"+discount);
		System.out.println("ͼ������:"+author);
		System.out.println("ͼ��ҳ��:"+pageNumber);
	}
}
