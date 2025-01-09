package javapractice;

public class ReverseString {

	public static void main(String[] args) {
	
		String originalstring="shivanjali";
		String reversedString= reverse(originalstring);
		System.out.println("originalstring:"+originalstring);
		System.out.println("reversestring:"+reversedString);

	}

	private static String reverse(String s) {
		String reversed="";
		int length=s.length();
		int index=length-1;
		while(index>=0) {
			if(index>=0) {
				reversed+=s.charAt(index);
				index--;
			}
		}
		return reversed;
	}

	

}

