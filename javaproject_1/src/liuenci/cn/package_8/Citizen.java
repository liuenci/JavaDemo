package liuenci.cn.package_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Citizen {

	/**
	 * @param args
	 */
	String name;
	String everName;
	String sex;
	Date date;
	long identificationCard;
	
	public Citizen(String name,
			String everName,
			String sex,
			Date date,
			long identificationCard){
		this.name = name;
		this.everName = everName;
		this.sex = sex;
		this.date = date;
		this.identificationCard = identificationCard;
	}
	
	//����
	public void changeName(String name, String everName){
		System.out.println("����������Ϊ:"+everName);
		System.out.println("����������Ϊ:"+name);
	}
	
	//��������
	public void age(Date nowDate, Date date){
		int uAge = nowDate.getYear() - date.getYear();
		System.out.println("��������Ϊ:"+uAge);
	}
	
	//������Ϣ
	public void checkInformation(String uName,
			String uEverName,
			String uSex,
			Date uDate,
			long uIdentificationCard){
		if ((name.equals(uName)
				&&(everName.equals(uEverName))
				&&(sex.equals(uSex))
				&&(date.equals(uDate))
				&&(identificationCard==uIdentificationCard))) {
			System.out.println("��Ϣ��ȷ");
		} else {
			System.out.println("��Ϣ����");
		}
	}
	//��ӡ��ϸ��Ϣ
	public void print(){
		System.out.println("���������Ϊ:"+everName);
		System.out.println("���������Ϊ:"+name);
		System.out.println("����Ա�Ϊ:"+sex);
		System.out.println("��ĳ�������Ϊ:"+date);
		System.out.println("������֤Ϊ:"+identificationCard);
	}
	public static void main(String[] args)throws ParseException{
		// TODO Auto-generated method stub
		//���2009��06��01�� ��Date����
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate1 = dateFormat1.parse("1997-03-18");
		Date nowDate = new Date();
		Citizen citizen = new Citizen("���ϸ�", "�ϸ�", "��", myDate1, 430423100003188244L);
		citizen.changeName("���ϸ�", "�ϸ�");
		System.out.println("========================");
		citizen.print();
		System.out.println("========================");
		citizen.age(nowDate, myDate1);
		System.out.println("========================");
		citizen.checkInformation("���ϸ�", "�ϸ�", "��", myDate1, 430423100003188244L);
	}

}
