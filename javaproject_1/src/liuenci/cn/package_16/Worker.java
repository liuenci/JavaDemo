package liuenci.cn.package_16;

import java.util.Date;

/**
 * Ա����
 * @author dell
 *
 */
public class Worker implements Comparable{
	private String name ; //����
	private String sex ;//�Ա�
	private String tel;//�绰
	private String date;//��������
	private int age;//����
	/**
	 * �޲ι���
	 */
	public Worker(){
		
	}
	/**
	 * ��������
	 * @param name
	 */
	public Worker(String name) {
		super();
		this.name = name;
	}
	/**
	 * �вι���
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
	//��ȡ����
	public String getName() {
		return name;
	}
	//��������
	public void setName(String name) {
		this.name = name;
	}
	//��ȡ�Ա�
	public String getSex() {
		return sex;
	}
	//�����Ա�
	public void setSex(String sex) {
		this.sex = sex;
	}
	//��ȡ�绰
	public String getTel() {
		return tel;
	}
	//���õ绰
	public void setTel(String tel) {
		this.tel = tel;
	}
	//��ȡ����
	public String getDate() {
		return date;
	}
	//��������
	public void setDate(String date) {
		this.date = date;
	}
	//��ȡ����
	public int getAge() {
		return age;
	}
	//��������
	public void setAge(int age) {
		this.age = age;
	}
	//������д��������ʾ��Ա��Ϣ
	@Override
	public String toString() {
		return this.getName()+" "+this.getSex()+" "+this.getTel()+" "+this.getDate();
	}
	
	//��д�ȽϷ���
	@Override
	public int compareTo(Object o) {
		int i=0;
		if(o instanceof Worker){
			Worker worker = (Worker)o;
			i= this.age-worker.age;  //��������	
		}
		return i;
	}
	
	
	
}
	
	

