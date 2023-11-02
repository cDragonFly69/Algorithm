//package TestDemo.account;
//
//import java.util.Scanner;
///*Utility工具类：
//将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节
//*/
//public class Utility {
//    private static Scanner scanner=new Scanner(System.in);
//    /*用于界面菜单的选择，该方法读取键盘，如果用户键入‘1’-‘4’中的任意字符，则方法返回，返回值为用户键入字符*/
//    public static char readMenuSelection(){
//        char c;
//        for (;;)
//        {
//            String str =readKeyBoard(1);
//            c = str.charAt(0);
//            if(c!='1'&&c !='2'&&c!='3'&&c!='4'){
//                System.out.print("选择错误，请重新输入：");
//            }
//            else
//                break;
//        }
//        return c;
//    }
//
//    private static String readKeyBoard(int i) {
//    }
//    /*用于收入和支出金额的输入， 该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值*/
//}
