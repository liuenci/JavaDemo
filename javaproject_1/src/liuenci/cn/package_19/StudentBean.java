package liuenci.cn.package_19;
/**
 * ѧ��ʵ����
 * @author Administrator
 *
 */
public class StudentBean {
	private int stuid;     //ѧ��id
	private String stucode; //ѧ��
	private String name;  //ѧ������
	private int sex;    //ѧ���Ա�
	private String phone;  //�绰
	private String birthday;   //��������
	
	/**
	 * �޲ι���
	 */
	public StudentBean() {
		super();
	}
	
	/**
	 * �вι���
	 * @param stuid
	 * @param stucode
	 * @param name
	 * @param sex
	 * @param phone
	 * @param birthday
	 */
	public StudentBean(int stuid,String stucode, String name, int sex, String phone, String birthday) {
		super();
		this.stuid = stuid;
		this.stucode = stucode;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.birthday = birthday;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStucode() {
		return stucode;
	}
	public void setStucode(String stucode) {
		this.stucode = stucode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
