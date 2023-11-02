package bank.Customer;

public class Customer {
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }


    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;
//设置名字
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //设置性别
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
//设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
//设置电话号码
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
//设置邮箱
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
