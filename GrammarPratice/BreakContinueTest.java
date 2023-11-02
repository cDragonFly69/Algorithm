package GrammarPratice;
/*
break和continue关键字的使用
        使用范围     在循环结构中的作用
break    switch-case
         循环结构中   结束（或跳出）当前循环结构
continue  循环结构中   结束（或跳出）当前循环结构
*/
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i%4==0){
//                break;
                continue;

            }
            System.out.print(i);
        }

    }
}
