package bank.CustomerView;

import bank.CMUtility.CMUtility;
import bank.Customer.Customer;
import bank.CustomerList.CustomerList;

public class CustomerView {
    //�����Ǹ��ͻ�������ʹ��
    private CustomerList customerList =new CustomerList(10);
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n--------�ͻ���Ϣ�������--------");
            System.out.println("          1.��ӿͻ�");
            System.out.println("          2.�޸Ŀͻ�");
            System.out.println("          3.ɾ���ͻ�");
            System.out.println("          4.�ͻ��б�");
            System.out.println("          5.�˳�\n");
            System.out.print("             ��ѡ��1-5��");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("ȷ���Ƿ��˳�(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("��ӿͻ��Ĳ���");
        System.out.println("-------------------��ӿͻ�-------------------");
        System.out.print("������");
        String name = CMUtility.readString(10);
        System.out.print("�Ա�:");
        char gender = CMUtility.readChar();
        System.out.print("����:");
        int age = CMUtility.readInt();
        System.out.print("�绰:");
        String phone = CMUtility.readString(13);
        System.out.print("����:");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("����������������������ӳɹ���������������������");
        }else{
            System.out.println("-----�ͻ����������ʧ��-----");
        }
    }
    private void modifyCustomer(){
        System.out.println("�޸��û��Ĳ���");
        System.out.println("------�޸Ŀͻ�-----");
        Customer cust;
        int number;

        for(;;){
            System.out.println("-----��ѡ����޸Ŀͻ����(-1�˳�):");
            number =CMUtility.readInt();
            if(number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if(cust == null){
                System.out.println("�޷��ҵ�ָ���ͻ���");
            }else{
                break;
            }
        }
        //�޸Ŀͻ���Ϣ
        System.out.print("����("+cust.getName()+"):");
        String name = CMUtility.readString(10,cust.getName());
        System.out.print("�Ա�("+cust.getGender()+"):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("����("+cust.getAge()+"):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("�绰("+cust.getPhone()+"):");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.print("����("+cust.getEmail()+"):");
        String email = CMUtility.readString(30,cust.getEmail());
        Customer newcust =new Customer(name,gender,age,phone,email);
//        customerList.replaceCustomer(number,newcust);
        boolean isReplaced = customerList.replaceCustomer(number - 1,newcust);
        if(isReplaced){
            System.out.println("�޸ĳɹ���");
        }else{
            System.out.println("�޸�ʧ�ܣ�");
        }

    }
    private void deleteCustomer(){
        System.out.println("ɾ���û��Ĳ���");
        int number;
        for (;;){
            System.out.print("��ѡ���ɾ���ͻ��ı��(-1�˳�):");
            number = CMUtility.readInt();
            if (number==-1){
                return;
            }
            Customer customer = customerList.getCustomer(number-1);
            if (customer==null){
                System.out.println("δ�ҵ�ָ���ͻ���");
            }else {
                break;
            }

        }
        boolean isDelete = customerList.deleteCustomer(number- 1);
        if (isDelete){
            System.out.println("ɾ���������!");
        }else{
            System.out.println("ɾ��ʧ�ܣ�");
        }
    }
    private void listAllCustomers(){
        System.out.println("�ͻ��б����");
       int total =customerList.getTotal();
        if(total == 0){
            System.out.println("û�пͻ���¼!");
        }else{
            System.out.println("���\t����\t�Ա�\t����\t�绰\t����");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());
            }
        }
        System.out.println("------�ͻ��б����-----");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();


    }
}
