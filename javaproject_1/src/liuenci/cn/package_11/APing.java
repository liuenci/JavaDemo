package liuenci.cn.package_11;

public class APing {
	private String name = "��ƽ";
	
	
	//ѵ��Ա��ƽÿ�춼Ҫѵ�����[���ܽ���ʲô�����Ҫ�Զ��������Ŀѵ����] 
	public void carryExercise(Animal feifei,
			Animal jingjing){
		System.out.println(name+
				"Ҫ��"+feifei.getName()+
				"��"+jingjing.getName()+
				"ȥѵ��");
	}
	//ѵ��Ա��ƽÿ�ܴ��������һ�Σ�[�����ο�Ҫ�󣬴���ͬ�Ķ�����ݽ�Ŀ��]
	public void carryShow1(Animal feifei){
		System.out.println(name+"Ҫ��"+feifei.getName()+
				"ȥ����");
	}
	public void carryShow2(Animal jingjing){
		System.out.println(name+"Ҫ��"+jingjing.getName()+
				"ȥ����");
	}
	public static void main(String[] args) {
		//ʵ�����Ʒ�
		Animal feifei = new FeiFei("�Ʒ�");
		feifei.show();
		feifei.exercise();
		//ʵ��������
		Animal jingjing = new JingJing("����");
		jingjing.show();
		jingjing.exercise();
		//ʵ������ƽ
		APing aping = new APing();
		aping.carryExercise(feifei, jingjing);
		aping.carryShow1(feifei);
		aping.carryShow2(jingjing);
	}

}
