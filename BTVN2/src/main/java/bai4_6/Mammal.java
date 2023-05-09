package bai4_6;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, double weight, String furColor) {
        super(name, weight);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the mammal makes a sound");
    }
}

