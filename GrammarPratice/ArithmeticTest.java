package GrammarPratice;
//算术运算符的练习
//逻辑运算符&和&&的区别
//相同点1：&和&&的运算结果相同
//相同点2：当符号左边是true时，二者都会执行符号右边的运算
//不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。
public class ArithmeticTest {
//    public static void main(String[] args) {
//        int num1 = 12;
//        int num2 = 7;
//        System.out.println(num1 / num2);//取整数
//        System.out.println(num1 % num2);//取余

//    }

//    //冒泡排序
//        public static void main(String[] args) {
//            int[] arr = {3, 5, 2, 1, 4};
//            for (int i = 0; i < arr.length - 1; i++) {
//                for (int j = 0; j < arr.length - 1 - i; j++) {
//                    if (arr[j] > arr[j + 1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }

//    /*== 和 equals的区别*/
public static void main(String[] args) {
    String a = "800";
    String b = "200";
    String c = "800";
    System.out.println(a==b);
    System.out.println(a==c);
    System.out.println(a.equals(b));
}
}