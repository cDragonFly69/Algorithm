package TestDemo;

import java.util.ArrayList;

public class Users {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();
        customers.add("23,23,42,12,4,1541,153,53,14,14,");
        System.out.println(customers.size());


    }
    private String name;
    private ArrayList<String> customers;

    public void addcustomers(ArrayList<String> customers){
        this.customers=customers;
    }
    public ArrayList<String> getcustomers(){
        return this.customers;
    }


}
