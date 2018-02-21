package liuenci.cn.package_3;

public class HomeWork_1 {

	/**
	 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，
	 * 又多吃了一个，第二天早上又将剩下的桃子吃掉一半，还不过瘾，又多吃了一个。
	 * 以后每天早上都吃了前一天剩下的桃子的一半零一个，
	 * 到第10天早上想再吃时，发现只剩下一个桃子了，请问第一天共摘了多少个桃子？ 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastOne=1;
		int sum=0;
		for(int i=1;i<10;i++){
			lastOne=(lastOne+1)*2;
		}
		System.out.println(lastOne);
	}

}
