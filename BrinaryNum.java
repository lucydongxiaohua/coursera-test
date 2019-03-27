package h2;

public class BrinaryNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IntToBinary(10);
		// Inverse(IntToBinary(20));
		number(Inverse(IntToBinary(20)));

	}

	public static String IntToBinary(int value) {

		String str = "";
		while (value != 0) {
			str += (value % 2);
			value = value / 2;

		}
		System.out.println(str);
		return str;
	}

	public static String Inverse(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0 && i < str.length(); i--) {
			newStr += str.substring(i, i + 1);
		}
		System.out.println("newStr" + newStr);
		return newStr;
	}

	public static int number(String str) {
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("1")) {
				++x;//先自加再赋值
			}

		}
		System.out.println("x:" + x);
		return x;

	}

}
