package GrammarPratice;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        String[]weeks = {"Monday","Tuesday","Wednesday","Thusday","Friday","Saturday","Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("������[1-7]��Χ������:");
        int number =scanner.nextInt();
        if (number < 1 || number>7){
            System.out.println("�����������Ƿ�����");
        }else {
            System.out.println("��Ӧ������Ϊ:"+weeks[number-1]);
        }
        scanner.close();
    }
}
