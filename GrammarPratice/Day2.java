package GrammarPratice;

/*自动类型提升:当容量小的数据类型的变量与容量大的数据类型的变量做运算时：
byte、char-->short-->int-->long-->float-->double
强制类型转换*/
/*
1.强制转换需要用强转符（）
2.强制转换可能导致精度损失
*/
public class Day2 {
    public static void main(String[] args) {
       byte b1=2;
       int i1=129;
       double d1=i1+b1;
        System.out.println(d1);
        byte b2=3;
        float f1=4;
        double d2=b2+f1;
        System.out.println(d2);
        short s1=2;
        char c1=2;
        int i2=c1+s1;
        System.out.println(i2);
        double d3=12.6;
        int i3=(int)d3;//截断操作
        System.out.println(i3);

    }
}
