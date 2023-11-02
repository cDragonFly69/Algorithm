package GrammarPratice;

public class whileFirst {
    public static void main(String[] args) {
        int n = 0;
        while (n <= 10) {
            n++;
            System.out.println(n);
            if(n==10){
                break;
            }
        }
    }
}