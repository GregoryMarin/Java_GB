package OOP;

public class Chocolate extends Product{
    protected double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Chocolate (String name, String brand, double price, double calories){
        super(name, brand, price);
        this.calories = calories;
    }


    @Override
    String displayInfo() {
        return String.format("[chocolate] Name: '%s', Brand: '%s', price: '%d'", name, brand, price);
    }
}
