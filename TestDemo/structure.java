package TestDemo;
//�̳е�ʹ��
public class structure {
    public static void main(String[] args) {
        Person ming = new Person();
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
        //sun�Ǽ̳���Person֮�£�����ô˷���ȥ����sun����
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
        Name = "С��";
        return Name;

    }
    public int getAge(){
        Age = 15;
        return Age;
    }
}

//Sun����̳�Person�ķ���
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
