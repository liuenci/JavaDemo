package liuenci.cn.package_16;

import java.sql.Date;

public class Employee implements Comparable{
	//姓名
	private String name;
	//性别
	private String sex;
	//电话号码
	private String tel;
	//出生日期
	private String briDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBriDate() {
		return briDate;
	}
	public void setBriDate(String briDate) {
		this.briDate = briDate;
	}
	public Employee(String name, String sex, String tel, String briDate) {
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.briDate = briDate;
	}
	@Override
	public String toString() {
		return this.getName()+" "+this.getSex()+" "+this.getTel()+" "+this.getBriDate();
	}
	@Override
	public int compareTo(Object o) {
		int result = 0;
		if(o instanceof Employee){
			Employee employee = (Employee)o;
			result = Date.valueOf(this.getBriDate()).getYear()-Date.valueOf(employee.getBriDate()).getYear();
		}
		return result;
	}
	
	
}
