package bank.CustomerList;
import bank.Customer.Customer;
public class CustomerList {
    private Customer[] customers;//���ڱ���ͻ����������
    private int total;//��¼�ѱ���ͻ����������
    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }
//    ���ڳ�ʼ��customers����
//    totalCustomer ָ������ĳ���
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
        //�������ÿղ���Ҳ����ɾ��
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
