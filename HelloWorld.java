import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){
//			System.out.println("HelloWorld");
		System.out.println(2+3+"=2+3="+(2+3));
		Scanner in = new java.util.Scanner(System.in);
//		System.out.println(in.nextLine());
		System.out.print("请输入票面:");
		int amount = in.nextInt();
		System.out.print("请输入金额:");
		int price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));

	}

}