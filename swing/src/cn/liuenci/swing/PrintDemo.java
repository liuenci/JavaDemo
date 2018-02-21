package cn.liuenci.swing;

import java.io.File;   
import java.io.FileInputStream;   
  
import javax.print.Doc;   
import javax.print.DocFlavor;   
import javax.print.DocPrintJob;   
import javax.print.PrintService;   
import javax.print.PrintServiceLookup;   
import javax.print.ServiceUI;   
import javax.print.SimpleDoc;   
import javax.print.attribute.DocAttributeSet;   
import javax.print.attribute.HashDocAttributeSet;   
import javax.print.attribute.HashPrintRequestAttributeSet;   
import javax.swing.JFileChooser;   
  
    /**  
     * �������ӡ��������  
     * @author Administrator  
     *  
     */  
public class PrintDemo {   
       
    public static void main(String[] args) {   
        JFileChooser fileChooser = new JFileChooser(); //������ӡ��ҵ   
        int state = fileChooser.showOpenDialog(null);   
        if(state == fileChooser.APPROVE_OPTION){   
            File file = new File("D:/zkyzl.txt"); //��ȡѡ����ļ�   
            //������ӡ�������Լ�   
            HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();   
            //���ô�ӡ��ʽ����Ϊδȷ�����ͣ�����ѡ��autosense   
            DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;   
            //�������еĿ��õĴ�ӡ����   
            PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);   
            //��λĬ�ϵĴ�ӡ����   
            PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();   
            //��ʾ��ӡ�Ի���   
            PrintService service = ServiceUI.printDialog(null, 200, 200, printService,    
                    defaultService, flavor, pras);   
            if(service != null){   
                try {   
                    DocPrintJob job = service.createPrintJob(); //������ӡ��ҵ   
                    FileInputStream fis = new FileInputStream(file); //�������ӡ���ļ���   
                    DocAttributeSet das = new HashDocAttributeSet();   
                    Doc doc = new SimpleDoc(fis, flavor, das);   
                    job.print(doc, pras);   
                } catch (Exception e) {   
                    e.printStackTrace();   
                }   
            }   
        }   
    }   
}
