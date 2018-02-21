package liuenci.cn.package_5;

public class Monkey {

	 /**
     * 输出一个菱形
     */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++){
			for(int j=0;j<20;j++){
				if((i<5&&j<13-i)||(i>4&&j<i+5)){
					System.out.print(" ");
				}
				else if(i<5&&(j==13+i||j==13-i)||i>4&&(j==5+i||j==21-i)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int x=0;x<5;x++){
			for(int y=0;y<4-x;y++){
				System.out.print(" ");
			}			
			for(int a=0;a<19+2*x;a++){
				if(((a%2!=0)&&x==0)||(x==4&&(a>8&&a<17||a%2!=0))){
					 System.out.print(" ");
				}
				else if(x==0||x==4||a==8||a==0||a==(10+2*x)||(a==(18+2*x))){
					System.out.print("*");					
				}				 
				else{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}

}
