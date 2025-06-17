import java.util.Scanner;

public class numcompare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        int max = 0;
//        if(x>y)
//            max=x;
//        else
//            max=y;
        max = x>y?(x>z?x:z):(y>z?y:z);

        System.out.println("最大值是: " + max);


    }
}
