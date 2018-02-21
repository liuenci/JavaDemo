package liuenci.cn.package_16;

import java.util.Date;

/**
 * 员工类
 * @author dell
 *
 */
public class Worker implements Comparable{
	private String name ; //姓名
	private String sex ;//性别
	private String tel;//电话
	private String date;//出生日期
	private int age;//年龄
	/**
	 * 无参构造
	 */
	public Worker(){
		
	}
	/**
	 * 姓名构造
	 * @param name
	 */
	public Worker(String name) {
		super();
		this.name = name;
	}
	/**
	 * 有参构造
	 * @param name
	 * @param sex
	 * @param tel
	 * @param date
	 */
	public Worker(String name, String sex, String tel, String date) {
		super();
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.date = date;
	}
	//获取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	//获取性别
	public String getSex() {
		return sex;
	}
	//设置性别
	public void setSex(String sex) {
		this.sex = sex;
	}
	//获取电话
	public String getTel() {
		return tel;
	}
	//设置电话
	public void setTel(String tel) {
		this.tel = tel;
	}
	//获取生日
	public String getDate() {
		return date;
	}
	//设置生日
	public void setDate(String date) {
		this.date = date;
	}
	//获取年龄
	public int getAge() {
		return age;
	}
	//设置年龄
	public void setAge(int age) {
		this.age = age;
	}
	//方法重写，正常显示成员信息
	@Override
	public String toString() {
		return this.getName()+" "+this.getSex()+" "+this.getTel()+" "+this.getDate();
	}
	
	//重写比较方法
	@Override
	public int compareTo(Object o) {
		int i=0;
		if(o instanceof Worker){
			Worker worker = (Worker)o;
			i= this.age-worker.age;  //升序排列	
		}
		return i;
	}
	
	
	
}
	
	

