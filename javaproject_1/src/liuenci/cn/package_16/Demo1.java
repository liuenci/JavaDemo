package liuenci.cn.package_16;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		//创建一个set集合对象
		Set set = new HashSet();
		//添加元素
		set.add(1);
		set.add(2);
		set.add(3);
		//遍历集合元素
		for(Object o:set){
			System.out.println(o);
		}
		//迭代器遍历集合
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
