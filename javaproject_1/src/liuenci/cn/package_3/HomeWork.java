package liuenci.cn.package_3;

public class HomeWork {
    /*
     * Çó1! + 2! + 3! + ... + 10!µÄºÍ
     */
    public static void main(String[] args) {
       int sum = 0;
       int temp = 1;
       for(int i=1;i<=10;i++){
    	   temp=1;
    	   for(int j=1;j<=i;j++){
    		  temp*=j;
    	   }
    	   sum+=temp;
       }
       System.out.println(sum);
       
    }
} 