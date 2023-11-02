package GrammarPratice;

public class doWhile {
    public static void main(String[] args) {
        int x=0;
        do{
            System.out.println("x="+x);
            x++;
        }while (x<=5);
    }

    public static class test1String {
        public static void main(String[] args) {
            String str = 3.5f+"";
            System.out.println(str);
            System.out.println(3+4+"Hello!");
            //通过charAt()通过下标索引的方法去访问String
            String hex="Dragonfly";
            char a=hex.charAt(0);
            System.out.println(a);
            //String和基本数据类型的运算起着连接的作用
            int number=2020031889;
            String numberStr="学号：";
            String info=numberStr+number;
            System.out.println(info);
        }
    }
}
