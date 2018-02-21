package liuenci.cn.package_17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		String path = "D:/yf1234.txt";
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file);
		System.out.print("«Î ‰»Îƒ⁄»›:");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		fileWriter.write(str+"\n");;
		fileWriter.close();
		FileReader fileReader = new FileReader(file);
		int r = fileReader.read();
		while(r!=-1){
			System.out.print((char)r);
			r = fileReader.read();
		}
	}

}
