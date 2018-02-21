package liuenci.cn.package_6;

public class HomeWork {

	/**
	 * @有一列乱序的字符：a、c、u、b、e、p、f、z，
	 * 排序并按照英文字母表的升序和逆序输出。 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char  grapheme[] = {'a','c','u','b','e','p','f','z'};
		
		//选择排序
		for(int i = 0;i<grapheme.length;i++){  //外层循环
			int min =i;
			for(int j = i+1;j<grapheme.length;j++){   //内层循环
				//当发现有值小于索引值将这个值赋值给min
				if(grapheme[j]<grapheme[min]){
					min = j;
				}
			}
			if(min!=i){
				char temp = grapheme[min];
				grapheme[min] = grapheme[i];
				grapheme[i] = temp;
				
			}
		}
		//正序输出字符数组
		System.out.print("升序输出:");
		for(int i=0;i<grapheme.length;i++){
			System.out.print(grapheme[i]+" ");
		}
		//换行
		System.out.println();
		//倒序输出字符数组
		System.out.print("倒序输出:");
		for(int i=grapheme.length-1;i>=0;i--){
			System.out.print(grapheme[i]+" ");
		}
	}

}
