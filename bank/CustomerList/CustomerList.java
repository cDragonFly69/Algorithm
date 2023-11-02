package bank.CustomerList;
import bank.Customer.Customer;
public class CustomerList {
    private Customer[] customers;//用于保存客户对象的数组
    private int total;//记录已保存客户对象的数量
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }
//    用于初始化customers数组
//    totalCustomer 指定数组的长度
    public boolean addCustomer(Customer customer){
        if(total >=customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index>= total){
            return false;
        }
        customers[index] =cust;
        return true;
    }
    public boolean deleteCustomer(int index){
        if (index<0 ||index>=total){
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i]=customers[i+1];
        }
        //将数据置空操作也就是删除
        customers[total-1]=null;
        total--;
        return true;
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if(index < 0 || index >=total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }
}
