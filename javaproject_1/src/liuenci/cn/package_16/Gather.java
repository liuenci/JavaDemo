package liuenci.cn.package_16;
import java.util.*;
public class Gather {

	public static void main(String[] args) {
		//创建集合类对象
		List<String>list = new ArrayList<>();
		//向集合中添加对象
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		//获得0-5之间的随机数
		int i = (int)(Math.random()*(list.size()-1));
		System.out.println("随机获取数组中的元素:"+list.get(i));
		list.remove(2);
		System.out.print("将集合中索引为2的对象删除之后的数组为:");
		Iterator<String>it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
