package javapractice;

public class SwappingNumber {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping");
		System.out.println("a:"+a+"b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a:"+a+"b:"+b);
	}

}
