package GrammarPratice;
//index是整形数组
//让index在arr中遍历
public class ArrayTest2 {
    public static void main(String[] args) {
        int []arr = new int[]{8,2,1,0,3};
        int []index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel ="";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式:"+tel);
    }
}
