package OOP_Sem1;

public class BottleOfWater extends Product{
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, int volume, int fat){
        this.volume = volume;
    }
    String displayInfo() {
        return String.format("[Water] %s, %s, %.2f, объем: :d; ",
                brand, name, price, volume);
    }

}
