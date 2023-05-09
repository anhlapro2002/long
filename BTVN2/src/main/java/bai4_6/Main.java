package bai4_6;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Buddy", 10.5, "brown", "Golden Retriever");
        animal1.makeSound();
        ((Dog) animal1).wagTail();

        Animal animal2 = new Cat("Whiskers", 5.0, "black", true);
        animal2.makeSound();
        ((Cat) animal2).purr();
    }
}


