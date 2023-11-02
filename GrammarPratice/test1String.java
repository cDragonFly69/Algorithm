package GrammarPratice;
public class test1String {
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
        //字符和int型相加时，先将字符转变成数字再与int型进行相加
        char c='a';
        int num =10;
        System.out.println(c+num);
        //* *
        char x='*';
        String k=" ";
        System.out.println(x+k+x);
        System.out.println("x"+' '+"*");
        long s=5;
        s=s-2;
        System.out.println(s);
        String str2=123+ "";
        System.out.println(str2);
    }
}
