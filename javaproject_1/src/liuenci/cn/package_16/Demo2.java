package liuenci.cn.package_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		//创建一个set集合对象
		Set set = new HashSet();
		Scanner input = new Scanner(System.in);
//		//添加元素
//		set.add(new Student("1", "刘恩赐", "男",10));
//		set.add(new Student("2", "刘松", "男", 11));
//		set.add(new Student("3", "朱昇", "男", 12));
		//连续存储五个同事
		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"个同事的姓名:");
			String name = input.next();
			set.add(new Colleague(name));
		}
		//输出每一个同事
		System.out.println("输出每一个同事:");
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//删除某一个员工
		System.out.println("请输入删除的员工姓名:");
		String name = input.next();
		iterator = set.iterator();
		while(iterator.hasNext()){
			Colleague colleague =(Colleague)iterator.next();
			if(colleague.getName().equals(name)){
				iterator.remove();
			}
		}
		for(Object o:set){
			System.out.println(o);
		}
		//删除某2个同事的名字，输出剩下的同事名字
		for(int i=0;i<2;i++){
			System.out.println("请输入删除的员工姓名:");
			String name1 = input.next();
			iterator = set.iterator();
			while(iterator.hasNext()){
				Colleague colleague =(Colleague)iterator.next();
				if(colleague.getName().equals(name1)){
					iterator.remove();
				}
			}
		}
		for(Object o:set){
			System.out.println(o);
		}
	}

}
