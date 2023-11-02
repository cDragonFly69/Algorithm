package TestDemo.DogGame;

//小狗和主人的面向对象游戏
//此函数为主函数
public class Game {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        System.out.println("小狗的品种:" + dog.type);
        person.feed();
        dog.eat();


    }
}
