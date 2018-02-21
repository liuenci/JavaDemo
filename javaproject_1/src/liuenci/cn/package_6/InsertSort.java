package liuenci.cn.package_6;

import java.util.Date;

public class InsertSort {

	/**
	 * @插入排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num={5,65,487,1,54,2,695};
		int[] num = new int[10000];
		
		for(int i=0;i<num.length;i++){//随机生成10000个数组元素
			num[i] = (int)(Math.random()*10000);
		}
		
		long first = new Date().getTime();
		for(int i=0;i<num.length;i++){
			for(int j=i;j>0;j--){
				if(num[j]<num[j-1]){
					int temp = num[j];
					num[j] = num[j-1];
					num[j-1] = temp;
				}
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		long last = new Date().getTime();
		
		System.out.println(last - first);
	}

}
