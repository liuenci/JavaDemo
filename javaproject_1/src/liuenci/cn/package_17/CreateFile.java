package liuenci.cn.package_17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class CreateFile {

	public static void main(String[] args){
		//创建文件路径
		String path  = "D:/yf1701.txt";
		//创建文件对象
		File file = new File(path);
		//调用createNewFile()方法
		try{
			if(file.createNewFile()){
				System.out.println("创建成功");
			}else{
				System.out.println("创建失败");
			}
		}catch(Exception e){
			System.out.println("文件路径不存在。");
		}
		//查看文件名
		System.out.println("文件名:"+file.getName());
		//查看文件路径
		System.out.println("文件路径:"+file.getPath());
		//查看文件大小
		System.out.println("文件大小:"+file.length());
		//查看文件最后修改时间
		System.out.println("修改时间:"+file.lastModified());
		if(file.exists()){
			//file.delete();
			System.out.println("删除文件成功。");
		}else{
			System.out.println("删除文件失败。");
		}
//		//创建文件路径
//		String path = "D://yf12";
//		//创建文件对象
//		File  file = new File(path);
//		if(file.getParentFile().exists()){
//			System.out.println("父文件夹存在。");
//		}else{
//			System.out.println("父文件夹不存在，创建文件夹");
//			file.getParentFile().mkdirs();
//		}
//		//调用CreateNewFlie()创建文件
//		if(file.mkdirs()){
//			System.out.println("创建成功");
//		}else{
//			System.out.println("创建失败");
//		}
//		//获取文件名（文件名，扩展名）
//		System.out.println(file.getName());
//		//获取文件路径（盘符:/文件夹/文件名.扩展名）
//		System.out.println(file.getPath());
//		System.out.println(file.lastModified());
//		Date date = new Date(file.lastModified());
//		System.out.println(date);
		
	}

}
