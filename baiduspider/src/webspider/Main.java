package webspider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���弴�����ʵ�����
				String url = "http://www.baidu.com";
				// ����һ���ַ��������洢��ҳ����
				String result = "";
				// ����һ�������ַ�������
				BufferedReader in = null;
				try
				{
					// ��stringת��url����
					URL realUrl = new URL(url);
					// ��ʼ��һ�����ӵ��Ǹ�url������
					URLConnection connection = realUrl.openConnection();
					// ��ʼʵ�ʵ�����
					connection.connect();
					// ��ʼ�� BufferedReader����������ȡURL����Ӧ
					in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					// ������ʱ�洢ץȡ����ÿһ�е�����
					String line;
					while ((line = in.readLine()) != null)
					{
						// ����ץȡ����ÿһ�в�����洢��result����
						result += line + "\n";
					}
				} catch (Exception e)
				{
					System.out.println("����GET��������쳣��" + e);
					e.printStackTrace();
				} // ʹ��finally���ر�������
				finally
				{
					try
					{
						if (in != null)
						{
							in.close();
						}
					} catch (Exception e2)
					{
						e2.printStackTrace();
					}
				}
				System.out.println(result);
			}

}
