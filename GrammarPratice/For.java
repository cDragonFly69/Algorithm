package GrammarPratice;
/*forѭ��һ���ǰ��գ�����˳�����ѭ����
����ִ��˳��Ϊ1-2-4-3
����for(�٣��ڣ���){
         ��
         }
*/

public class For {
    public static void main(String[] args) {
        //���9�е�helloworld
        for (int x=1;x<10;x=x+1){
            System.out.println(x);
            System.out.println("helloworld");
        }
        for(int b=1;b<5;b++){
            System.out.println("ѭ���ĴΣ���");
        }
        //�������abcbc
        int num =1;
        for (System.out.println("a");num<3; System.out.println("c"),num++){

            System.out.println("b");

        }
        //������������1-100���ڵ�ż��������ȡż���ĸ����������е�ż���ĺ�
        int count=0;
        int sum =0;
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("ż���ĸ���Ϊ: "+count);
        System.out.println("����ż���ĺ�Ϊ��"+sum);

    }

}
