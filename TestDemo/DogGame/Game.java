package TestDemo.DogGame;

//С�������˵����������Ϸ
//�˺���Ϊ������
public class Game {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        System.out.println("С����Ʒ��:" + dog.type);
        person.feed();
        dog.eat();


    }
}
