package OOP_Sem1;

public class BottleOfMilk extends Product {
    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, int volume, int fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    String displayInfo() {
        return String.format("[Milk] %s, %s, %2f, объем: %d; жирность : %d ",
                brand, name, price, volume, fat);
    }
}
