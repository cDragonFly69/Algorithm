package GrammarPratice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        factorial demo = new factorial();
        int n;
        System.out.println("ÇëÊäÈëÊı×Ö¼ÆËã½×³Ë£º");
        Scanner scan = new Scanner(System.in);
//        int sum = demo.getsum();


    }

    public int getsum(int n) {
        int sum;
        if (n == 1) {
            return 1;
        } else {
            return sum = n * (n - 1);
        }
    }
}
