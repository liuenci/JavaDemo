package liuenci.cn.package_7;

public class Goods {
	String name;//��Ʒ����
	String code;//����
	Double price;//�۸�
	String type;//����
	
	void discount(){
		System.out.println("����ʮ���꣬ȫ����Ʒһ����");
	}
	
	void changeType(String type){
		this.type = type;
		System.out.println("������Ʒ������Ϊ:"+type);
	}
	
	void printInformation(String name,String code,Double price, String type){
		System.out.println("��Ʒ��:"+name);
		System.out.println("����:"+code);
		System.out.println("�۸�:"+price);
		System.out.println("����:"+type);
	}
}
