package liuenci.cn.firstproject;

/**
 * Created by �� on 2017/6/19.
 */
public class Owner extends User{

    //����ҵ��ָ������
    private String fingerPrint;
    //����ҵ����������
    private String password;

    //����set��get����
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
