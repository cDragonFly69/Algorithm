package GrammarPratice;

import java.util.Scanner;

public class Person {

        public static void main(String[] args) {
            Person person = new Person();
            person.setName();
            System.out.println("����:"+person.getName());
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName() {
            System.out.println("����������:");
            Scanner scanner = new Scanner(System.in);
            this.name = scanner.nextLine();

        }
    }

