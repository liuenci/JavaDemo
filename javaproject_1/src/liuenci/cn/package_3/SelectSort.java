package liuenci.cn.package_3;

public class SelectSort {

	/**
	 * 直接选择排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个乱序的数组
		int[] array={2,55,62,44,25,16};
		//创建直接排序的对象
		SelectSort sorter=new SelectSort();
		//调用直接选择算法对数组排序
		sorter.sort(array);
	}
	public void sort(int[] array){
		int index;
		for(int i=1;i<array.length;i++){
			index=0;
			for(int j=1;j<=array.length-i;j++){
				if(array[j]>array[index]){
					index=j;
				}
				//交换在位置array.length-i和index(最大值)上的两个数
				int temp=array[array.length-i];
				array[array.length-i]=array[index];
				array[index]=temp;
			}
			
		}
		showArray(array);
	}
	public void showArray(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			int num=array[i];
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
