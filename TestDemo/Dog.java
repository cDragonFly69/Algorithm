package TestDemo;

public class Dog {
    int dogAge;//定义dog的年龄为int
    public Dog(String name){
        System.out.println("The dog name is :"+name);
    }
    public void setAge(int age){
        dogAge=age;
    }
    //获取年龄
    public int getAge(){
        System.out.println("The dog's age is: "+dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        Dog name =new Dog("pika");
        name.setAge(2);
        name.getAge();
    }
}
