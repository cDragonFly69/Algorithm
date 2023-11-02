package bank.CustomerView;

import bank.CMUtility.CMUtility;
import bank.Customer.Customer;
import bank.CustomerList.CustomerList;

public class CustomerView {
    //创建是个客户对象来使用
    private CustomerList customerList =new CustomerList(10);
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n--------客户信息管理软件--------");
            System.out.println("          1.添加客户");
            System.out.println("          2.修改客户");
            System.out.println("          3.删除客户");
            System.out.println("          4.客户列表");
            System.out.println("          5.退出\n");
            System.out.print("             请选择（1-5）");
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
                    System.out.print("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("添加客户的操作");
        System.out.println("-------------------添加客户-------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("——————————添加成功——————————");
        }else{
            System.out.println("-----客户已满，添加失败-----");
        }
    }
    private void modifyCustomer(){
        System.out.println("修改用户的操作");
        System.out.println("------修改客户-----");
        Customer cust;
        int number;

        for(;;){
            System.out.println("-----请选择待修改客户编号(-1退出):");
            number =CMUtility.readInt();
            if(number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if(cust == null){
                System.out.println("无法找到指定客户！");
            }else{
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名("+cust.getName()+"):");
        String name = CMUtility.readString(10,cust.getName());
        System.out.print("性别("+cust.getGender()+"):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄("+cust.getAge()+"):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话("+cust.getPhone()+"):");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.print("邮箱("+cust.getEmail()+"):");
        String email = CMUtility.readString(30,cust.getEmail());
        Customer newcust =new Customer(name,gender,age,phone,email);
//        customerList.replaceCustomer(number,newcust);
        boolean isReplaced = customerList.replaceCustomer(number - 1,newcust);
        if(isReplaced){
            System.out.println("修改成功！");
        }else{
            System.out.println("修改失败！");
        }

    }
    private void deleteCustomer(){
        System.out.println("删除用户的操作");
        int number;
        for (;;){
            System.out.print("请选择待删除客户的编号(-1退出):");
            number = CMUtility.readInt();
            if (number==-1){
                return;
            }
            Customer customer = customerList.getCustomer(number-1);
            if (customer==null){
                System.out.println("未找到指定客户！");
            }else {
                break;
            }

        }
        boolean isDelete = customerList.deleteCustomer(number- 1);
        if (isDelete){
            System.out.println("删除操作完成!");
        }else{
            System.out.println("删除失败！");
        }
    }
    private void listAllCustomers(){
        System.out.println("客户列表操作");
       int total =customerList.getTotal();
        if(total == 0){
            System.out.println("没有客户记录!");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getGender()+"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());
            }
        }
        System.out.println("------客户列表完成-----");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();


    }
}
