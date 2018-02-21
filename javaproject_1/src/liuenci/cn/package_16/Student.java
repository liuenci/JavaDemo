package liuenci.cn.package_16;

public class Student implements Comparable{
	private String number;
	private String name;
	private String sex;
	private int age;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String number, String name, String sex, int age) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.getNumber()+" "+this.getName()+" "+this.getAge()+" "+this.getSex();
	}
	@Override
	public int compareTo(Object o) {
		int i=0;
		if(o instanceof Student){
			Student student = (Student)o;
			//i= this.age-dog.age;  //ÉıĞò
			i = this.age - student.age;  //µ¹Ğò
		}
		return i;
	}
	
}
