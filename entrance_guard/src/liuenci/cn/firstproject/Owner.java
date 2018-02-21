package liuenci.cn.firstproject;

/**
 * Created by 刘 on 2017/6/19.
 */
public class Owner extends User{

    //定义业主指纹属性
    private String fingerPrint;
    //定义业主密码属性
    private String password;

    //定义set和get方法
    public void setFingerPrint(String fingerPrint){
        this.fingerPrint = fingerPrint;
    }
    public String getFingerPrint(){
        return fingerPrint;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}
