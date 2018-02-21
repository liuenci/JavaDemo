package jsoup;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Html {

	// 根据url从网络获取网页文本
	public Document getHtmlTextByUrl(String url) {
		Document doc = null;
		try {
			// doc = Jsoup.connect(url).timeout(5000000).get();
			int i = (int) (Math.random() * 1000); // 做一个随机延时，防止网站屏蔽
			while (i != 0) {
				i--;
			}
			doc = Jsoup.connect(url).data("query", "Java").userAgent("Mozilla").cookie("auth", "token").timeout(300000)
					.post();
			doc = Jsoup.connect(url).timeout(5000000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return doc;
	}

	// 根据本地路径获取网页文本，如果不存在就通过url从网络获取并保存

	public Document getHtmlTextByPath(String name, String url) {
		String path = "D:/Html/" + name + ".html";
		Document doc = null;
		File input = new File(path);
		String urlcat = url;
		try {
			doc = Jsoup.parse(input, "GBK");
			if (!doc.children().isEmpty()) {
				doc = null;
				System.out.println("已经存在");
			}
		} catch (IOException e) {
			System.out.println("文件未找到，正在从网络获取.......");
			doc = this.getHtmlTextByUrl(url);
			// 并且保存到本地
			this.Save_Html(url, name);
		}
		return doc;
	}
	// 此处为保存网页的函数
	// 将网页保存在本地（通过url,和保存的名字）

	public void Save_Html(String url, String name) {
		try {
			name = name + ".html";
			System.out.print(name);
			File dest = new File("D:/Html/" + name);// D:\Html
			// 接收字节输入流
			InputStream is;
			// 字节输出流
			FileOutputStream fos = new FileOutputStream(dest);

			URL temp = new URL(url);
			is = temp.openStream();

			// 为字节输入流加缓冲
			BufferedInputStream bis = new BufferedInputStream(is);
			// 为字节输出流加缓冲
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int length;

			byte[] bytes = new byte[1024 * 20];
			while ((length = bis.read(bytes, 0, bytes.length)) != -1) {
				fos.write(bytes, 0, length);
			}

			bos.close();
			fos.close();
			bis.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Html().Save_Html(" http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/index.html","中國紳士");
	}
}