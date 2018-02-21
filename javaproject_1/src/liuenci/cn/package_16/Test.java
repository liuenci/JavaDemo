package liuenci.cn.package_16;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		//创建集合
		List<Student> list = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		//添加五个学生对象到集合中
		for(int i=0;i<5;i++){
			System.out.println("====第"+(i+1)+"个:====");
			System.out.print("请输入学号:");
			String number = input.next();
			System.out.print("请输入姓名:");
			String name = input.next();
			System.out.print("请输入性别:");
			String sex = input.next();
			System.out.print("请输入年龄:");
			int age = input.nextInt();
			list.add(new Student(number,name,sex,age));
		}
		System.out.println("添加成功。");
		//判断张三是否在集合中
		for(int i =0;i<list.size();i++){
			if(list.get(i).getName().equals("张三")){
				System.out.println("张三在里面");
			}
			
		}
		//按照学生年龄排序
		System.out.println("按照学生年龄排序:");
		Collections.sort(list);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}

}
