package liuenci.cn.package_8;

import java.util.Date;

public class Teacher {

	/**
	 * @param args
	 */
	String name;
	String sex;
	Date date;
	String technology;
	
	public Teacher(String name,String sex,Date date,
			String technology)
	{
		this.name = name;
		this.sex = sex;
		
		this.date = date;
		this.technology = technology;
	}
	
	//·½·¨
	public void show(){
		System.out.println(name);
		System.out.println(sex);
		System.out.println(date);
		System.out.println(technology);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Teacher t = new Teacher("Áõ¶÷´Í","ÄÐ",date,"java");
		
		t.show();
	}

}
