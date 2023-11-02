package GrammarPratice;
//寻求最大值
public class MAX {
    public static void main(String[] args) {
        int arr[] = new int[]{10,4,6,7,8,9};
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= Max){
                Max = arr[i];
            }
        }
        System.out.println(Max);
    }
}
