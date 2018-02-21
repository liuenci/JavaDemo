package liuenci.cn.package_11;

public class APing {
	private String name = "阿平";
	
	
	//训练员阿平每天都要训练动物：[不管接收什么动物，都要对动物进行项目训练。] 
	public void carryExercise(Animal feifei,
			Animal jingjing){
		System.out.println(name+
				"要带"+feifei.getName()+
				"和"+jingjing.getName()+
				"去训练");
	}
	//训练员阿平每周带动物表演一次：[根据游客要求，带不同的动物表演节目。]
	public void carryShow1(Animal feifei){
		System.out.println(name+"要带"+feifei.getName()+
				"去表演");
	}
	public void carryShow2(Animal jingjing){
		System.out.println(name+"要带"+jingjing.getName()+
				"去表演");
	}
	public static void main(String[] args) {
		//实例化菲菲
		Animal feifei = new FeiFei("菲菲");
		feifei.show();
		feifei.exercise();
		//实例化静静
		Animal jingjing = new JingJing("静静");
		jingjing.show();
		jingjing.exercise();
		//实例化阿平
		APing aping = new APing();
		aping.carryExercise(feifei, jingjing);
		aping.carryShow1(feifei);
		aping.carryShow2(jingjing);
	}

}
