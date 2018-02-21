package liuenci.cn.package_14;

public class FontTime {

	public static void main(String[] args) {
		//统计每个字出现的次数
		int sum=1;
		String str="老方扛着黄幌子，"
				+ "老黄扛着方幌子。"
				+ "老方要拿老黄的方幌子，"
				+ "老黄要拿老方的黄幌子，"
				+ "末了儿方幌子碰破了黄幌子，"
				+ "黄幌子碰破了方幌子。";
		//把String类型转成单个的字符型
		char[] singleChar=str.toCharArray();
		for(int i=0;i<singleChar.length;i++){
			if(singleChar[i]!=' '){
				for(int j=i+1;j<singleChar.length;j++){
					//当后面出现相同的字的时候，把后面的字变成空格，防止重复计数。
					if(singleChar[i]==singleChar[j]){
						singleChar[j]=' ';
						sum++;
					}
				}
				//打印
				System.out.println("“"+str.valueOf(singleChar[i])+"”的个数有"+(sum)+"个");
				//重置sum
				sum=1;
			}
		}
	}

}
