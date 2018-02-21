package cn.liuenci.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {

	public static void main(String[] args) {
		String path = ".";
		File file = new File(path);
		String[] list;
		if(args.length==0){
			list = file.list();
		}else{
			list=file.list();
		}
	}

}
class DirFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		return false;
	}
	
}