package liuenci.cn.package_10;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Base a0 = new Base();
		 Child a1 = new Child();
	}

}
class Base{
	  private String name;
	  public Base(){
	    name="Base constructor";
	  }
	  public Base(String pName){
	    name=pName;
	  }
	  public void method(){
	    System.out.println(name);
	  }
	}
	class Child extends Base{
	   public Child(){
	    super("Child constructor");
	   }
	   public void method(){
	    System.out.println("Child method");    
	   }
	   
	} 
