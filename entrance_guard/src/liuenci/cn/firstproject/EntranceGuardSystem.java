package liuenci.cn.firstproject;

import java.util.Scanner;

/**
 * Created by �� on 2017/6/19.
 */
public class EntranceGuardSystem {
    //��������Ŷ���
    ElectronicGate electronicGate;
    //�����������
    Owner[] owner;
    //���������֤����
    IdentityVerification identityVerification;

    /**
     * ��ʼ����Ϣ
     */
    public void init(){
        //���������Ŷ���
        ElectronicGate electronicGate = new ElectronicGate();
        //�����û��������飬���100���û�������Ϣ
        Owner[] owner = new Owner[100];
    }
    /**
     * ����ָ��¼��ҵ����Ϣ��(¼��һ��ҵ��)
     */
    public User addFingerprint(){
        //����һ��ס��������һ�����û�Ҫ��סС��
        Owner owner = new Owner();
        //��ʾ¼����Ϣ
        System.out.println("����¼���û���");
        System.out.println("����������:");
        Scanner input = new Scanner(System.in);
        //ɨ������������ס�������name��
        String userName = input.next();
        owner.setName(userName);
        while (true){
            System.out.println("0.��Ĵָ 1.��ʳָ 2.����ָ 3.������ָ 4.��Сָ");
            System.out.println("5.��Ĵָ 6.��ʳָ 7.����ָ 8.������ָ 9.��Сָ");
            System.out.println("��¼�����ָ��:");
            String fingerprint = input.next();
            //�ж�ѡ���Ƿ񳬳���Χ
            if(fingerprint.charAt(0)>=0&&fingerprint.charAt(0)<=9){
                owner.setFingerPrint(fingerprint);
                break;
            }else {
                System.out.println("ָ������������¼�룡");
                continue;
            }
        }
        return owner;
    }
    /**
     * ��������¼��ҵ����Ϣ
     */
    public User addPassword(){
        //����һ���û�������һ�����û�Ҫ��סС��
        Owner owner = new Owner();
        //��ʾ¼����Ϣ
        System.out.println("����¼��ҵ����Ϣ");
        System.out.println("����������:");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        owner.setName(userName);
        System.out.println("�����������֤����");
        //ɨ�����룬����ס�������password��
        String user2Password = input.next();
        owner.setPassword(user2Password);
        return owner;
    }
    /**
     * �����û�
     */
    public void addUser(){
        //����һ��ס��������һ�����û�Ҫ��סС��
        Owner owner = new Owner();
        //ѭ��
        while(true){
            System.out.println("��ѡ����֤��ʽ:1.���� 2.ָ��");
            //ɨ��ѡ��
            Scanner input = new Scanner(System.in);
            String op = input.next();
            if(op.equals("1")){
                //���ø�������¼��ķ���
                owner = (Owner) this.addPassword();
                break;
            }else if(op.equals("2")){
                owner = (Owner) this.addFingerprint();
                break;
            }else{
                System.out.println("ѡ�����������ѡ��");
                continue;
            }
        }
        for(int i= 0;i<owner.length;i++){
            //�жϵ�i���û��Ƿ�Ϊ��
            if(owner[i]==null){
                owner[i]=owner;
                System.out.println("��Ϣ¼��ɹ�");
            }else {
                System.out.println("��С���Ѿ�ס���ˣ�");
            }
        }
    }

    /**
     * ��ѯҵ����Ϣ
     */
    public void show(){
        System.out.println("����\t����\tָ��");
        System.out.println(owner);
    }
}
