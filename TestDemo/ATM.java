package TestDemo;

import java.util.Scanner;
/**
 * @author Michael  Dragon
 */ /*
@author:DragonFly
*/
public class ATM{
    public static void main(String[] args) {
        double balance = 0.0;
        Scanner scan = new Scanner(System.in);
        boolean isFlag = true;//���ڿ���ѭ���Ľ���
        do {
            System.out.println("======ATM======");
            System.out.println("\t1�����");
            System.out.println("\t2��ȡ��");
            System.out.println("\t3����ʾ���");
            System.out.println("\t4���˳�");
            System.out.println("��ѡ��1-4����");

            int selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.print("Ҫ���Ķ��Ϊ��");
                    double addMoney = scan.nextDouble();
                    if (addMoney > 0) {
                        balance += addMoney;
                    }
                    break;
                case 2:
                    System.out.print("Ҫȡ��Ķ��Ϊ:");
                    double minusMoney = scan.nextDouble();
                    if (minusMoney > 0 && balance >= minusMoney) {
                        balance -= minusMoney;
                    } else {
                        System.out.println("����������ݷǷ�������");
                    }
                    break;
                case 3:
                    System.out.println("��ǰ�����Ϊ: " + balance);
                    break;
                case 4:
                    System.out.println("��ӭ�´ν����ϵͳ^_^");
                    isFlag = false;
                    break;
                default:
                    System.out.println("������ѡ��");
                    break;
            }
            }
            while (isFlag) ;
            //��Դ�ر�
            scan.close();

        }
}
