public class HelloWorld {
	public static void main(String[] args) {
		String str1 = args[0], str2 = args[1];
		char chr = str1.charAt(0);
		int offset = Integer.parseInt(args[1]);
		int chrNum = chr;
		int num1 = chrNum + offset;
		char res1 = (char)num1;
		System.out.println(res1);
	}
}
