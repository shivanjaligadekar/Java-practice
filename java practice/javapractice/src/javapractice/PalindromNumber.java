package javapractice;

public class PalindromNumber {

	public static void main(String[] args) {
		String x="nayan ";
		int i=0,j=x.length()-1;
		while(i<j) {
			if(x.charAt(i)!=x.charAt(j)) {
				System.out.println("not palindrom");
				System.exit(0);
			}
			i--;
			j++;
		}
		System.out.println("palindrom");
	}

}
