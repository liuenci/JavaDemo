package liuenci.cn.package_16;

import java.util.*;

//创建类实现Comparable接口
public class UpdateStu implements Comparable<Object>{
	String name;
	long id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UpdateStu(String name,long id) {
		this.name = name ;
		this.id = id;
	}
	@Override
	public int compareTo(Object o) {
		UpdateStu updateStu = (UpdateStu)o;
		//三目运算符
		//如果id大于updateStu.id返回1
		//如果id等于updateStu.id返回0
		//如果id小于updateStu.id返回-1
		int result = id>updateStu.id?1:(id == updateStu.id?0:-1);
		return result;
	}
	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu("刘恩赐1号",10001);
		UpdateStu stu2 = new UpdateStu("刘恩赐2号",10002);
		UpdateStu stu3 = new UpdateStu("刘恩赐3号",10003);
		UpdateStu stu4 = new UpdateStu("刘恩赐4号",10004);
		TreeSet<UpdateStu>tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu>it = tree.iterator();
		//遍历集合
		System.out.println("Set集合中的所有元素:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//截取排在stu2之前的对象,得到的对象不包括stu2
		it = tree.headSet(stu2).iterator();
		System.out.println("截取排在stu2之前的对象:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//截取排在stu2和stu3之间的对象,得到的对象不包括stu3
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("截取排在stu2和stu3之间的对象:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//截取stu2之后的所有对象,得到的对象包括stu2
		it = tree.tailSet(stu2).iterator();
		System.out.println("截取stu2之后的所有对象:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//创建Map对象
		Map<String,String>map = new HashMap<>();
		//向集合中添加对象
		map.put("01", "刘恩赐1号");
		map.put("02", "刘恩赐2号");
		map.put("03", "刘恩赐3号");
		map.put("04", "刘恩赐4号");
		map.put("05", "刘恩赐5号");
		//构建Map集合中所有key对象的集合
		Set<String>set = map.keySet();
		//创建集合迭代器
		Iterator<String>it1 = set.iterator();
		System.out.println("key集合中的元素:");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		Collection<String>coll = map.values();
		it1 = coll.iterator();
		System.out.println("values集合中的元素:");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}

	

}
