package GrammarPratice;

import java.util.Scanner;

/*求最大公约数和最大公倍数*/
public class ForTest1 {
    public static void main(String[] args) {
        int m, n;
        System.out.println("请输入第一个数:");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        System.out.println("请输入第二个数：");
        n = input.nextInt();
        int min = (m > n) ? m : n;
        for (int i = 1; i < min; i++) {
            if (m%i==0&&n%i==0){
                System.out.println(i);
            }


        }
    }
}
