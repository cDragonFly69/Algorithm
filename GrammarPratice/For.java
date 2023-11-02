package GrammarPratice;
/*for循环一般是按照（）里顺序进行循环，
就是执行顺序为1-2-4-3
比如for(①，②，③){
         ④
         }
*/

public class For {
    public static void main(String[] args) {
        //输出9行的helloworld
        for (int x=1;x<10;x=x+1){
            System.out.println(x);
            System.out.println("helloworld");
        }
        for(int b=1;b<5;b++){
            System.out.println("循环四次！！");
        }
        //需求：输出abcbc
        int num =1;
        for (System.out.println("a");num<3; System.out.println("c"),num++){

            System.out.println("b");

        }
        //需求三：遍历1-100以内的偶数，并获取偶数的个数，获所有的偶数的和
        int count=0;
        int sum =0;
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为: "+count);
        System.out.println("所有偶数的和为："+sum);

    }

}
