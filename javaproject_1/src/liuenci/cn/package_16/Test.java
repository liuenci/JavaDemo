package liuenci.cn.package_16;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		//��������
		List<Student> list = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		//������ѧ�����󵽼�����
		for(int i=0;i<5;i++){
			System.out.println("====��"+(i+1)+"��:====");
			System.out.print("������ѧ��:");
			String number = input.next();
			System.out.print("����������:");
			String name = input.next();
			System.out.print("�������Ա�:");
			String sex = input.next();
			System.out.print("����������:");
			int age = input.nextInt();
			list.add(new Student(number,name,sex,age));
		}
		System.out.println("��ӳɹ���");
		//�ж������Ƿ��ڼ�����
		for(int i =0;i<list.size();i++){
			if(list.get(i).getName().equals("����")){
				System.out.println("����������");
			}
			
		}
		//����ѧ����������
		System.out.println("����ѧ����������:");
		Collections.sort(list);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}

}
