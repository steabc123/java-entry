import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(5==5.0);
        System.out.print("请投币: ");
        int amonut = in.nextInt();
        if(amonut>=10) {
            System.out.println("****************");
            System.out.println("*Java城际铁路专线*");
            System.out.println("*  无指定座位票  *");
            System.out.println("*    票件10元   *");
            System.out.println("****************");

            System.out.println("找零: " + (amonut - 10));
        }
        else
            System.out.println("投入金额不足，请重新投币");
    }
}
