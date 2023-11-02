package algorithmTest;

import javax.xml.namespace.QName;


public class test1 {
    private String name;
    //¹¹ÔìÆ÷
    public test1(int n){

    }
    public  test1(String n){

    }
    public test1(double n){

    }
    int arr[] = {12,2,3,4,24,34,54,66};
    int i = 2;
    public void getValue1(){
        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]/arr[0]);
        }

    }
    public void getValue2(){
        for (int i = 1; i<= arr.length; i+=2) {
            System.out.println(arr[i]/arr[0]);
        }

    }


    public static void main(String[] args) {
        test1 test =new test1("");
        test.getValue2();


    }

}
