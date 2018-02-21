package liuenci.cn.package_16;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TestDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		Employee employee1 = new Employee("松哥一号","男","15096325586","1991-09-02");
		Employee employee2 = new Employee("松哥二号","男","15096325586","1992-09-02");
		Employee employee3 = new Employee("松哥三号","男","15096325586","1993-09-02");
		Employee employee4 = new Employee("松哥四号","女","15096325586","1994-09-02");
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		//添加一个新员工
		System.out.println("****添加员工****");
		System.out.print("姓名:");
		String name = input.next();
		System.out.print("性别:");
		String sex = input.next();
		System.out.print("电话号码:");
		String tel = input.next();
		System.out.print("出生日期:");
		String briDate = input.next();
		Employee employee5 = new Employee(name, sex, tel, briDate);
		list.add(employee5);
		//使用迭代器循环显示
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
		//删除一个辞职员工
		System.out.println("删除一个辞职员工");
		System.out.println("请输入员工的姓名:");
		String name1 = input.next();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name1)){
				list.remove(i);
			}
		}
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
		//计算员工的平均年龄
		System.out.println("平均年龄为:");
		double age = 0;
		for(int i=0;i<list.size();i++){
			age += new Date(System.currentTimeMillis()).getYear() -Date.valueOf(list.get(i).getBriDate()).getYear();
		}
		System.out.print(age/list.size());
		//统计男女生的性别分别为多少
		int male = 0;
		int female = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getSex().equals("男")){
				male++;
			}else{
				female++;
			}
		}
		System.out.println("统计男女生的性别分别为多少");
		System.out.println("男生个数:"+male);
		System.out.println("女生个数:"+female);
		//找出最大的员工
		int num=0;
		for(int i=0;i<list.size()-1;i++){
			if(Date.valueOf(list.get(i).getBriDate()).after(Date.valueOf(list.get(i+1).getBriDate()))){
				num=i+1;
			}
		}
		System.out.println("最大的员工是:"+list.get(num).getName());
	}

}
