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

	// ����url�������ȡ��ҳ�ı�
	public Document getHtmlTextByUrl(String url) {
		Document doc = null;
		try {
			// doc = Jsoup.connect(url).timeout(5000000).get();
			int i = (int) (Math.random() * 1000); // ��һ�������ʱ����ֹ��վ����
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

	// ���ݱ���·����ȡ��ҳ�ı�����������ھ�ͨ��url�������ȡ������

	public Document getHtmlTextByPath(String name, String url) {
		String path = "D:/Html/" + name + ".html";
		Document doc = null;
		File input = new File(path);
		String urlcat = url;
		try {
			doc = Jsoup.parse(input, "GBK");
			if (!doc.children().isEmpty()) {
				doc = null;
				System.out.println("�Ѿ�����");
			}
		} catch (IOException e) {
			System.out.println("�ļ�δ�ҵ������ڴ������ȡ.......");
			doc = this.getHtmlTextByUrl(url);
			// ���ұ��浽����
			this.Save_Html(url, name);
		}
		return doc;
	}
	// �˴�Ϊ������ҳ�ĺ���
	// ����ҳ�����ڱ��أ�ͨ��url,�ͱ�������֣�

	public void Save_Html(String url, String name) {
		try {
			name = name + ".html";
			System.out.print(name);
			File dest = new File("D:/Html/" + name);// D:\Html
			// �����ֽ�������
			InputStream is;
			// �ֽ������
			FileOutputStream fos = new FileOutputStream(dest);

			URL temp = new URL(url);
			is = temp.openStream();

			// Ϊ�ֽ��������ӻ���
			BufferedInputStream bis = new BufferedInputStream(is);
			// Ϊ�ֽ�������ӻ���
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
		new Html().Save_Html(" http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/index.html","�Ї���ʿ");
	}
}