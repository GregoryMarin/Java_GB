package OOP_Sem1;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume){
        for (Product product : products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) products;
                if (bottleOfMilk.name.equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(double calories){
        if (products instanceof Chocolate){
            Chocolate chocolate = (Chocolate) products;
            if (chocolate.calories == calories){
                return chocolate;
            }
        }
        return null;
    }

}
