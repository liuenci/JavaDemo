package liuenci.cn.package_16;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class MapTest2 {

	public static void main(String[] args) {
		//����һ��map����
		Map<String,String> map = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		//�򼯺������Ԫ��
		map.put("15073376772", "�ɸ�һ��");
		map.put("15073376773", "�ɸ����");
		map.put("15073376774", "�ɸ�����");
		map.put("15073376775", "�ɸ��ĺ�");
		for(Entry<String,String> e:map.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.print("������ɾ���ĵ绰����:");
		String tel = input.next();
		map.remove(tel);
		System.out.println("ɾ��֮��:");
		for(Entry<String,String> e:map.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
