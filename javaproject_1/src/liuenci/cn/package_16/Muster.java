package liuenci.cn.package_16;

import java.util.*;

public class Muster {

	public static void main(String[] args) {
		//ʵ�������������
		Collection<String>list = new ArrayList<>();
		//�򼯺����������
		list.add("a");
		list.add("b");
		list.add("c");
		//����������
		Iterator<String>it = list.iterator();
		//�ж��Ƿ�����һ��Ԫ��
		while(it.hasNext()){
			//��ȡ������Ԫ��,next()�������ص���Object
			String str  = (String)it.next();
			System.out.print(str+"\t");
		}
	}

}
