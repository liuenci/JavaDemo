package liuenci.cn.package_7;
/*
 * ����һ����˾�࣬�����ơ�ע���Ա����������Ӫҵ������������
A���붨������
B���붨������ķ���
    ���㹫˾һ��ĳɱ�֧��
    Ա����ְ����Ĺ�˾��������
    ׷�ӹ�˾��ע����
    ���⹫����˾��Ϣ
    �ڶ��»��Ϲ�����˾����Ϣ 
 */
public class Company {
	String name;//��˾����
	double registrationAmount = 1000000.0;//ע����
	int number = 1000;//Ա������
	double money;//��Ӫҵ��
	double profit;//������
	
	public void cost(double money,double profit){
		System.out.println("��˾һ��ĳɱ�֧��Ϊ:"+(money-profit));
	}
	
	public void allNumber(int num){
		System.out.println("��˾Ա����ְ֮��˾��������Ϊ:"+(number-num));
	}
	
	public void addCost(double addRegistration){
		System.out.println("׷�ӹ�˾��ע����Ϊ:"+addRegistration);
	}
	
	public void publishInformation(){
		System.out.println("��˾����:"+name);
		System.out.println("��˾ע����:"+registrationAmount);
		System.out.println("��˾Ա������:"+number);
	}
	
	public void privateInformation(){
		System.out.println("��˾����:"+name);
		System.out.println("��˾ע����:"+registrationAmount);
		System.out.println("��˾Ա������:"+number);
		System.out.println("��˾��Ӫҵ��:"+money);
		System.out.println("��˾������"+profit);
	}
}
