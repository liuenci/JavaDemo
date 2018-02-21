package liuenci.cn.package_16;
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		//��HashMapʵ�ֵ�Map����
		Map<String, String>map = new HashMap<>();
		//����Emp����
		Emp emp1 = new Emp("008", "������1��");
		Emp emp2 = new Emp("003", "������3��");
		Emp emp3 = new Emp("002", "������2��");
		Emp emp4 = new Emp("0022", "������4��");
		map.put(emp1.getE_id(), emp1.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		map.put(emp4.getE_id(), emp4.getE_name());
		//��ȡMap�����е�key���󼯺�
		Set<String>set = map.keySet();
		Iterator<String>it = set.iterator();
		System.out.println("HashMap��ʵ�ֵ�Map����,����:");
		while(it.hasNext()){
			String str = (String)it.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
		}
		TreeMap<String,String>treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator<String>iter = treemap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������:");
		while(iter.hasNext()){
			String str = (String)iter.next();
			String name = (String)map.get(str);
			System.out.println(str+" "+name);
		}
	}

}
