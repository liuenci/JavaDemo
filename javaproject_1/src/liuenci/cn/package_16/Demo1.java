package liuenci.cn.package_16;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		//����һ��set���϶���
		Set set = new HashSet();
		//���Ԫ��
		set.add(1);
		set.add(2);
		set.add(3);
		//��������Ԫ��
		for(Object o:set){
			System.out.println(o);
		}
		//��������������
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
