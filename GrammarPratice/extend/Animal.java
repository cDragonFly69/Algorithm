package GrammarPratice.extend;
//继承类的练习
public class Animal {
    private String name;
    private int id;
    public Animal(String myName,int myid){
        name=myName;
        id=myid;
    }
    public void eat()
    {
        System.out.println(name+"正在吃");
    }
    public  void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是" +id+"号"+name+".");
    }

    public static void main(String[] args) {
        System.out.println(Mouse.class);
        System.out.println(Penguin.class);
    }
}
