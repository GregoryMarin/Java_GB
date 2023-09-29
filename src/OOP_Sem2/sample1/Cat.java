package OOP_Sem2.sample1;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Cat says 'miau'");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumped");
    }

}
