package liuenci.cn.package_16;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class MapTest2 {

	public static void main(String[] args) {
		//创建一个map集合
		Map<String,String> map = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		//向集合中添加元素
		map.put("15073376772", "松哥一号");
		map.put("15073376773", "松哥二号");
		map.put("15073376774", "松哥三号");
		map.put("15073376775", "松哥四号");
		for(Entry<String,String> e:map.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.print("请输入删除的电话号码:");
		String tel = input.next();
		map.remove(tel);
		System.out.println("删除之后:");
		for(Entry<String,String> e:map.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
