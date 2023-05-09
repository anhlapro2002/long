package bai4_6;

public class Dog extends Mammal {
    private String breed;

    public Dog(String name, double weight, String furColor, String breed) {
        super(name, weight, furColor);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println(getName() + " the dog is wagging its tail");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the dog Woof");
    }
}


