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
	
	//改名
	public void changeName(String name, String everName){
		System.out.println("您的曾用名为:"+everName);
		System.out.println("您的现用名为:"+name);
	}
	
	//计算年龄
	public void age(Date nowDate, Date date){
		int uAge = nowDate.getYear() - date.getYear();
		System.out.println("您的年龄为:"+uAge);
	}
	
	//检验信息
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
			System.out.println("信息正确");
		} else {
			System.out.println("信息错误");
		}
	}
	//打印详细信息
	public void print(){
		System.out.println("你的曾用名为:"+everName);
		System.out.println("你的现用名为:"+name);
		System.out.println("你的性别为:"+sex);
		System.out.println("你的出生日期为:"+date);
		System.out.println("你的身份证为:"+identificationCard);
	}
	public static void main(String[] args)throws ParseException{
		// TODO Auto-generated method stub
		//获得2009年06月01日 的Date对象
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate1 = dateFormat1.parse("1997-03-18");
		Date nowDate = new Date();
		Citizen citizen = new Citizen("南南哥", "南哥", "男", myDate1, 430423100003188244L);
		citizen.changeName("南南哥", "南哥");
		System.out.println("========================");
		citizen.print();
		System.out.println("========================");
		citizen.age(nowDate, myDate1);
		System.out.println("========================");
		citizen.checkInformation("南南哥", "南哥", "男", myDate1, 430423100003188244L);
	}

}
