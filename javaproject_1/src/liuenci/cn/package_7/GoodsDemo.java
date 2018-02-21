package liuenci.cn.package_7;

public class GoodsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods good = new Goods();
		good.changeType("特步");
		good.discount();
		good.printInformation("新百伦","110",1000.0,"百度");
	}

}
