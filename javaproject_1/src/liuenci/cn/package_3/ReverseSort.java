package liuenci.cn.package_3;

public class ReverseSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个数组
		int[] array={100,90,80,70,60,50,40,30,20,10,0};
		ReverseSort sorter=new ReverseSort();
		//调用反转排序对象的方法将数组反转
		sorter.sort(array);
	}
	public void sort(int[] array){
		System.out.print("数组原来内容：");
		showArray(array);//排序前的数组值
		int temp;
		int len=array.length;
		for(int i=0;i<len/2;i++){
			temp=array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.print("数组反转后内容：");
		showArray(array);
	}
	public void showArray(int[] array){
		for(int i:array){
			System.out.print(" "+i);
		}
		System.out.println();
	}
}
