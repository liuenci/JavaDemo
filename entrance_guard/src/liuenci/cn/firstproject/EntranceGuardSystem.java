package liuenci.cn.firstproject;

import java.util.Scanner;

/**
 * Created by 刘 on 2017/6/19.
 */
public class EntranceGuardSystem {
    //定义电子门对象
    ElectronicGate electronicGate;
    //定义对象数组
    Owner[] owner;
    //定义身份验证对象
    IdentityVerification identityVerification;

    /**
     * 初始化信息
     */
    public void init(){
        //创建电子门对象
        ElectronicGate electronicGate = new ElectronicGate();
        //创建用户对象数组，存放100个用户对象信息
        Owner[] owner = new Owner[100];
    }
    /**
     * 根据指纹录入业主信息；(录入一个业主)
     */
    public User addFingerprint(){
        //创建一个住户对象；有一个新用户要入住小区
        Owner owner = new Owner();
        //提示录入信息
        System.out.println("正在录入用户！");
        System.out.println("请输入姓名:");
        Scanner input = new Scanner(System.in);
        //扫描姓名，存在住户对象的name中
        String userName = input.next();
        owner.setName(userName);
        while (true){
            System.out.println("0.左拇指 1.左食指 2.左中指 3.左无名指 4.左小指");
            System.out.println("5.右拇指 6.右食指 7.右中指 8.右无名指 9.右小指");
            System.out.println("请录入你的指纹:");
            String fingerprint = input.next();
            //判断选项是否超出范围
            if(fingerprint.charAt(0)>=0&&fingerprint.charAt(0)<=9){
                owner.setFingerPrint(fingerprint);
                break;
            }else {
                System.out.println("指纹有误，请重新录入！");
                continue;
            }
        }
        return owner;
    }
    /**
     * 根据密码录入业主信息
     */
    public User addPassword(){
        //创建一个用户对象，有一个新用户要入住小区
        Owner owner = new Owner();
        //提示录入信息
        System.out.println("正在录入业主信息");
        System.out.println("请输入姓名:");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        owner.setName(userName);
        System.out.println("请输入你的验证密码");
        //扫描密码，存在住户对象的password中
        String user2Password = input.next();
        owner.setPassword(user2Password);
        return owner;
    }
    /**
     * 新增用户
     */
    public void addUser(){
        //创建一个住户对象，有一个新用户要入住小区
        Owner owner = new Owner();
        //循环
        while(true){
            System.out.println("请选择验证方式:1.密码 2.指纹");
            //扫描选项
            Scanner input = new Scanner(System.in);
            String op = input.next();
            if(op.equals("1")){
                //调用根据密码录入的方法
                owner = (Owner) this.addPassword();
                break;
            }else if(op.equals("2")){
                owner = (Owner) this.addFingerprint();
                break;
            }else{
                System.out.println("选择错误，请重新选择！");
                continue;
            }
        }
        for(int i= 0;i<owner.length;i++){
            //判断第i个用户是否为空
            if(owner[i]==null){
                owner[i]=owner;
                System.out.println("信息录入成功");
            }else {
                System.out.println("该小区已经住满了！");
            }
        }
    }

    /**
     * 查询业主信息
     */
    public void show(){
        System.out.println("姓名\t密码\t指纹");
        System.out.println(owner);
    }
}
