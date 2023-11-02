package TestDemo;
//继承的使用
public class structure {
    public static void main(String[] args) {
        Person ming = new Person();
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
        //sun是继承在Person之下，因此用此方法去创建sun对象
        Person sun = new Sun();
//        System.out.println(sun.getAge());
//        System.out.println(sun.getName());
        sun.getName();
    }

}
class Person{
    private String Name;
    private int Age;

    public String getName(){
        Name = "小明";
        return Name;

    }
    public int getAge(){
        Age = 15;
        return Age;
    }
}

//Sun对象继承Person的方法
class Sun extends Person{
    
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
