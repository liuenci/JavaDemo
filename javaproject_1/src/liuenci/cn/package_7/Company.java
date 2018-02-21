package liuenci.cn.package_7;
/*
 * 定义一个公司类，有名称、注册金额、员工人数、年营业额、年利润等属性
A）请定义属性
B）请定义下面的方法
    计算公司一年的成本支出
    员工离职后更改公司的总人数
    追加公司的注册金额
    对外公布公司信息
    在董事会上公布公司的信息 
 */
public class Company {
	String name;//公司名称
	double registrationAmount = 1000000.0;//注册金额
	int number = 1000;//员工人数
	double money;//年营业额
	double profit;//年利润
	
	public void cost(double money,double profit){
		System.out.println("公司一年的成本支出为:"+(money-profit));
	}
	
	public void allNumber(int num){
		System.out.println("公司员工离职之后公司的总人数为:"+(number-num));
	}
	
	public void addCost(double addRegistration){
		System.out.println("追加公司的注册金额为:"+addRegistration);
	}
	
	public void publishInformation(){
		System.out.println("公司名称:"+name);
		System.out.println("公司注册金额:"+registrationAmount);
		System.out.println("公司员工人数:"+number);
	}
	
	public void privateInformation(){
		System.out.println("公司名称:"+name);
		System.out.println("公司注册金额:"+registrationAmount);
		System.out.println("公司员工人数:"+number);
		System.out.println("公司年营业额:"+money);
		System.out.println("公司年利润"+profit);
	}
}
