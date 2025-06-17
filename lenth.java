import java.util.Scanner;

public class lenth {
    public static void main(String[] args){
        int foot;//英尺
        int inch;//英寸
        foot = (int)(30/3.0);
        Scanner in = new Scanner(System.in);
//        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
    }


}
