package liuenci.cn.firstproject;

/**
 * Created by 刘 on 2017/6/19.
 */
public class visitor extends Owner{
    //定义访客的姓名属性
    private String name;
    //定义set和get方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
