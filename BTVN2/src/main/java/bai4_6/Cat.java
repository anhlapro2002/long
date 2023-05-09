package bai4_6;

public class Cat extends Mammal {
    private boolean isIndoor;

    public Cat(String name, double weight, String furColor, boolean isIndoor) {
        super(name, weight, furColor);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    public void purr() {
        System.out.println(getName() + " the cat is purring");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the cat meows");
    }
}

