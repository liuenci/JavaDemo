package liuenci.cn.package_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		//����һ��set���϶���
		Set set = new HashSet();
		Scanner input = new Scanner(System.in);
//		//���Ԫ��
//		set.add(new Student("1", "������", "��",10));
//		set.add(new Student("2", "����", "��", 11));
//		set.add(new Student("3", "��N", "��", 12));
		//�����洢���ͬ��
		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"��ͬ�µ�����:");
			String name = input.next();
			set.add(new Colleague(name));
		}
		//���ÿһ��ͬ��
		System.out.println("���ÿһ��ͬ��:");
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//ɾ��ĳһ��Ա��
		System.out.println("������ɾ����Ա������:");
		String name = input.next();
		iterator = set.iterator();
		while(iterator.hasNext()){
			Colleague colleague =(Colleague)iterator.next();
			if(colleague.getName().equals(name)){
				iterator.remove();
			}
		}
		for(Object o:set){
			System.out.println(o);
		}
		//ɾ��ĳ2��ͬ�µ����֣����ʣ�µ�ͬ������
		for(int i=0;i<2;i++){
			System.out.println("������ɾ����Ա������:");
			String name1 = input.next();
			iterator = set.iterator();
			while(iterator.hasNext()){
				Colleague colleague =(Colleague)iterator.next();
				if(colleague.getName().equals(name1)){
					iterator.remove();
				}
			}
		}
		for(Object o:set){
			System.out.println(o);
		}
	}

}
