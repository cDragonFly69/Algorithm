package GrammarPratice;

import java.util.Scanner;

/*�����Լ������󹫱���*/
public class ForTest1 {
    public static void main(String[] args) {
        int m, n;
        System.out.println("�������һ����:");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        System.out.println("������ڶ�������");
        n = input.nextInt();
        int min = (m > n) ? m : n;
        for (int i = 1; i < min; i++) {
            if (m%i==0&&n%i==0){
                System.out.println(i);
            }


        }
    }
}
