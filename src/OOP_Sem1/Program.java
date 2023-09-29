package OOP_Sem1;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("Bottle of water", "OOO Istocnik", 210);
        Product product2 = new Product("Butle of water (2)");
        Product product3 = new Product("Butle of water (3)", 30);
        Product product4 = new Product("Beautiful name", "Gojo", 500);
        BottleOfMilk bfm = new BottleOfMilk("Marklin", "Borika", 124, 1, 1);
        BottleOfMilk bfm2 = new BottleOfMilk("Marklin", "Musia", 134, 2, 1);
        BottleOfMilk bfm3 = new BottleOfMilk("Marklin", "Dusia", 140, 2, 2);

       /* System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());
        System.out.println(product3.displayInfo());
        System.out.println(product4.displayInfo());

        System.out.println(bfm.displayInfo());

        */
        Chocolate ch1 = new Chocolate("Bounty", "Chockopy", 45, 460 );
        System.out.println(ch1.displayInfo());

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);
        arrayList.add(ch1);
        arrayList.add(bfm);
        arrayList.add(bfm2);
        arrayList.add(bfm3);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Butle of water (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("You bought: ");
            System.out.println(bottleOfMilk.displayInfo());
        }else {
            System.out.println("Don't have this kind or product((( ");
        }

        Chocolate chocolate = vendingMachine.getChocolate(345);
        if (chocolate != null){
            System.out.println("You bought: ");
            System.out.println(chocolate.displayInfo());
        }else {
            System.out.println("Don't have this kind or product((( ");
        }
    }



}