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
		Employee employee1 = new Employee("�ɸ�һ��","��","15096325586","1991-09-02");
		Employee employee2 = new Employee("�ɸ����","��","15096325586","1992-09-02");
		Employee employee3 = new Employee("�ɸ�����","��","15096325586","1993-09-02");
		Employee employee4 = new Employee("�ɸ��ĺ�","Ů","15096325586","1994-09-02");
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		//���һ����Ա��
		System.out.println("****���Ա��****");
		System.out.print("����:");
		String name = input.next();
		System.out.print("�Ա�:");
		String sex = input.next();
		System.out.print("�绰����:");
		String tel = input.next();
		System.out.print("��������:");
		String briDate = input.next();
		Employee employee5 = new Employee(name, sex, tel, briDate);
		list.add(employee5);
		//ʹ�õ�����ѭ����ʾ
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
		//ɾ��һ����ְԱ��
		System.out.println("ɾ��һ����ְԱ��");
		System.out.println("������Ա��������:");
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
		//����Ա����ƽ������
		System.out.println("ƽ������Ϊ:");
		double age = 0;
		for(int i=0;i<list.size();i++){
			age += new Date(System.currentTimeMillis()).getYear() -Date.valueOf(list.get(i).getBriDate()).getYear();
		}
		System.out.print(age/list.size());
		//ͳ����Ů�����Ա�ֱ�Ϊ����
		int male = 0;
		int female = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getSex().equals("��")){
				male++;
			}else{
				female++;
			}
		}
		System.out.println("ͳ����Ů�����Ա�ֱ�Ϊ����");
		System.out.println("��������:"+male);
		System.out.println("Ů������:"+female);
		//�ҳ�����Ա��
		int num=0;
		for(int i=0;i<list.size()-1;i++){
			if(Date.valueOf(list.get(i).getBriDate()).after(Date.valueOf(list.get(i+1).getBriDate()))){
				num=i+1;
			}
		}
		System.out.println("����Ա����:"+list.get(num).getName());
	}

}
