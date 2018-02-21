package liuenci.cn.package_3;

public class HomeWork_2 {

	/**
	 * 使用循环语句打印三个菱形
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			if(i==1){
				for(int n=1;n<=9;n++){
					System.out.print(" ");
				}
				for(int j=1;j<=5-i;j++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			else{
				for(int n=1;n<=9;n++){
					System.out.print(" ");
				}
				for(int a=1;a<=5-i;a++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int k=1;k<=2*(i-2)+1;k++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		for(int i=1;i<=4;i++){
			if(i!=4){
				for(int n=1;n<=9;n++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int k=1;k<=7-2*i;k++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			if(i==4){
				for(int n=1;n<=9;n++){
					System.out.print(" ");
				}
				for(int a=1;a<=4;a++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
		}
		for(int i=1;i<=5;i++){
			if(i==1){
				for(int k=1;k<=5-i;k++){
					System.out.print(" ");
				}
				for(int j=1;j<=10;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			else if(i>=2&&i<=4){
				for(int b=1;b<=5-i;b++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int c=1;c<=7;c++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int d=1;d<=2*i-1;d++){
					System.out.print(" ");
				}
				System.out.print("*");
				for(int e=1;e<=7;e++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			else{
				for(int f=1;f<=5;f++){
					System.out.print("* ");
				}
				for(int g=1;g<=8;g++){
					System.out.print(" ");
				}
				for(int l=1;l<=5;l++){
					System.out.print("* ");
				}
			}
		}
		
	}

}
