package GrammarPratice;

public class ArrayTest1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("数组的长度为:" + arr.length);
        System.out.println("数组的元素有：");
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}
