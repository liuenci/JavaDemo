package liuenci.cn.package_16;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		//ɾ���ڶ����͵��ĸ�Ԫ��
		System.out.println();
		list.remove(1);
		list.remove(2);
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		//���Ԫ��
		System.out.println();
		list.clear();
		System.out.println("���֮��:");
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}
}
