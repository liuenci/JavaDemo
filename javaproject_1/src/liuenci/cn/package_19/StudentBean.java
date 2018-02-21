package liuenci.cn.package_19;
/**
 * 学生实体类
 * @author Administrator
 *
 */
public class StudentBean {
	private int stuid;     //学生id
	private String stucode; //学号
	private String name;  //学生姓名
	private int sex;    //学生性别
	private String phone;  //电话
	private String birthday;   //出生日期
	
	/**
	 * 无参构造
	 */
	public StudentBean() {
		super();
	}
	
	/**
	 * 有参构造
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
