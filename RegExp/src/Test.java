

public class Test {

	public static void main(String[] args) {
		//简单认识正则表达式
		/*System.out.println("abc".matches("..."));
		p("a8729b".replaceAll("\\d", "-"));
		Pattern p = Pattern.compile("[a-z]{3}");
		Matcher m = p.matcher("fff");
		p(m.matches());
		p("123".matches("\\d{3}"));*/
		//初步认识.*+
		/*p("a".matches("."));
		p("aa".matches("aa"));
		p("aaaa".matches("a+"));
		p("aaaa".matches("a*"));
		p("".matches("a*"));
		p("a".matches("a?"));
		p("a".matches("a?"));
		p("2222222222222222222222222222222222".matches("\\d{3,100}"));
		p("192.168.122.asD".matches("\\d{1,3}+\\.+\\d{1,3}\\.+\\d{1,3}+\\.+[a-zA-Z]{1,3}"));
		p("192".matches("[0-2][0-9][0-9]"));*/
		/*p("a".matches("[abc]"));
		p("a".matches("[^abc]"));
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z]|[A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		p("A".matches("A-Z&&[RFG]"));*/
		//认识\s\w\d\ 
		/*p(" \n\r\t".matches("\\s{1,4}"));
		p(" ".matches("\\S"));
		p("a_8".matches("\\w{1,3}"));
		p("abc888&^%".matches("[a-z]{1,3}\\d{1,3}+[&^#%]+"));
		p("\\".matches("\\\\"));*/
		/*p("hello sir".matches("^h.*"));//点代表任意字符，*代表零个或者多个字符
		p("hello sir".matches(".*r$"));//$代表一行的结束
		p("hello sir".matches("^h[a-z]{1,10}\\s[a-z]{1,10}"));
		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));
		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));
		p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));*/
		System.out.println("1.1".matches("^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$"));
	}
	public static void p(Object o){
		System.out.println(o);
	}
}
