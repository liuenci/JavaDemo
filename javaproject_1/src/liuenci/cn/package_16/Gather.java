package liuenci.cn.package_16;
import java.util.*;
public class Gather {

	public static void main(String[] args) {
		//�������������
		List<String>list = new ArrayList<>();
		//�򼯺�����Ӷ���
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		//���0-5֮��������
		int i = (int)(Math.random()*(list.size()-1));
		System.out.println("�����ȡ�����е�Ԫ��:"+list.get(i));
		list.remove(2);
		System.out.print("������������Ϊ2�Ķ���ɾ��֮�������Ϊ:");
		Iterator<String>it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
