package liuenci.cn.package_3;

public class ReverseSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		int[] array={100,90,80,70,60,50,40,30,20,10,0};
		ReverseSort sorter=new ReverseSort();
		//���÷�ת�������ķ��������鷴ת
		sorter.sort(array);
	}
	public void sort(int[] array){
		System.out.print("����ԭ�����ݣ�");
		showArray(array);//����ǰ������ֵ
		int temp;
		int len=array.length;
		for(int i=0;i<len/2;i++){
			temp=array[i];
			array[i]=array[len-1-i];
			array[len-1-i]=temp;
		}
		System.out.print("���鷴ת�����ݣ�");
		showArray(array);
	}
	public void showArray(int[] array){
		for(int i:array){
			System.out.print(" "+i);
		}
		System.out.println();
	}
}
