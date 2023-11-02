package GrammarPratice;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        String[]weeks = {"Monday","Tuesday","Wednesday","Thusday","Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入[1-7]范围的整数:");
        int number =scanner.nextInt();
        if (number < 1 || number>7){
            System.out.println("你输入的输入非法！！");
        }else {
            System.out.println("对应的星期为:"+weeks[number-1]);
        }
        scanner.close();
    }
}
