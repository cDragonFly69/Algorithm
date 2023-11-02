package GrammarPratice;


abstract class Animail {
    public abstract void sound();

    public void sleep() {
        System.out.println("sleep");
    }
}

class Cat extends Animail{
    public void sound(){
        System.out.println("jiaojiao");
    }
}


public class abstractAnimail {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}