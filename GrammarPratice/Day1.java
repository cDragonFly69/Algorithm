package GrammarPratice;

/*
变量的数据类型：
基本数据类型:byte,short,float,double,int,long,char,boolean,
引用数据类型：类（class),接口（interface）,数组（array[]）
*/public class Day1 {

    public static void main(String[] args) {
        int myNumber;//变量的声明
        myNumber=12;//变量的定义
//        System.out.println(myNumber);//变量的使用
        int myAge=21;//变量的声明与定义
        System.out.println(myAge+myNumber);//变量的使用
        byte a1=12;//字节型
        byte a2=-128;//字节
        System.out.println(a1);
        System.out.println(a2);
        short b1=128;//短整型
        System.out.println(b1);
        long c1=123456;//长整型
        System.out.println(c1);
        double d1=123.3465;//双精度型
        System.out.println(d1);
        float f1=12.3f;//单精度的时候必须加一个F或f,不然出现报错
        System.out.println(f1);//通常定义浮点型变量时，使用double型。
        char e1='a';//声明定义char型通常使用一对’‘，否则报错
        char e2='b';//只能有一个字符，若产生多个字符，使用字符串
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Hello World! 你好，中国！");
        System.out.println("GrammarPratice.Day1\n即将结束");
        boolean isAnswer=true;//布尔类型（只能取true和false）
        if(isAnswer==true){
            System.out.println("是的！不遗憾！");
        }else {
            System.out.println("不是的!");

        }
        boolean c=true;
        System.out.println(c);

    }
}
