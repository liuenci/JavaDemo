package liuenci.cn.package_16;
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		//由HashMap实现的Map对象
		Map<String, String>map = new HashMap<>();
		//创建Emp对象
		Emp emp1 = new Emp("008", "刘恩赐1号");
		Emp emp2 = new Emp("003", "刘恩赐3号");
		Emp emp3 = new Emp("002", "刘恩赐2号");
		Emp emp4 = new Emp("0022", "刘恩赐4号");
		map.put(emp1.getE_id(), emp1.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		map.put(emp4.getE_id(), emp4.getE_name());
		//获取Map集合中的key对象集合
		Set<String>set = map.keySet();
		Iterator<String>it = set.iterator();
		System.out.println("HashMap类实现的Map集合,无序:");
		while(it.hasNext()){
			String str = (String)it.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
		}
		TreeMap<String,String>treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator<String>iter = treemap.keySet().iterator();
		System.out.println("TreeMap类实现的Map集合，键对象升序:");
		while(iter.hasNext()){
			String str = (String)iter.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
		}
	}

}
