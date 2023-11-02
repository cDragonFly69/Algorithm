package GrammarPratice;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[][] arr = {{122, 23, 42, 54},
                {213}, {312}, {42}, {634}};
        String[][] names = {{"张飞", "刘备", "关羽", "赵云", "马超", "黄忠"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" \n" + arr[i][j]);
                if (i < names.length && j < names[i].length) {
                    System.out.println(" " + names[i][j]);
                }

            }

        }
    }
}