package liuenci.cn.package_16;

import java.util.*;

//������ʵ��Comparable�ӿ�
public class UpdateStu implements Comparable<Object>{
	String name;
	long id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UpdateStu(String name,long id) {
		this.name = name ;
		this.id = id;
	}
	@Override
	public int compareTo(Object o) {
		UpdateStu updateStu = (UpdateStu)o;
		//��Ŀ�����
		//���id����updateStu.id����1
		//���id����updateStu.id����0
		//���idС��updateStu.id����-1
		int result = id>updateStu.id?1:(id == updateStu.id?0:-1);
		return result;
	}
	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu("������1��",10001);
		UpdateStu stu2 = new UpdateStu("������2��",10002);
		UpdateStu stu3 = new UpdateStu("������3��",10003);
		UpdateStu stu4 = new UpdateStu("������4��",10004);
		TreeSet<UpdateStu>tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu>it = tree.iterator();
		//��������
		System.out.println("Set�����е�����Ԫ��:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//��ȡ����stu2֮ǰ�Ķ���,�õ��Ķ��󲻰���stu2
		it = tree.headSet(stu2).iterator();
		System.out.println("��ȡ����stu2֮ǰ�Ķ���:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//��ȡ����stu2��stu3֮��Ķ���,�õ��Ķ��󲻰���stu3
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("��ȡ����stu2��stu3֮��Ķ���:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//��ȡstu2֮������ж���,�õ��Ķ������stu2
		it = tree.tailSet(stu2).iterator();
		System.out.println("��ȡstu2֮������ж���:");
		while(it.hasNext()){
			UpdateStu stu = (UpdateStu)it.next();
			System.out.println(stu.getId()+" "+stu.getName());
		}
		//����Map����
		Map<String,String>map = new HashMap<>();
		//�򼯺�����Ӷ���
		map.put("01", "������1��");
		map.put("02", "������2��");
		map.put("03", "������3��");
		map.put("04", "������4��");
		map.put("05", "������5��");
		//����Map����������key����ļ���
		Set<String>set = map.keySet();
		//�������ϵ�����
		Iterator<String>it1 = set.iterator();
		System.out.println("key�����е�Ԫ��:");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		Collection<String>coll = map.values();
		it1 = coll.iterator();
		System.out.println("values�����е�Ԫ��:");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}

	

}
