package OOP;

/**
 * Продукт
 */
public class Product {
    protected String name;

    protected String brand;

    protected Double price;

    public Product(){
        name = "<Product>";
        brand = "<Brand>";
        price = 100.0;
    }

    public Product(String name){
        this.name = name;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, String brand, double price){
        if (brand == null || brand.length()<3){
            this.brand = "<Brand>";
        }else{
            this.brand = brand;
        }

        if (price < 100){
            price = 100;
        }else{
            this.price = price;
        }
        if (name == null || name.length() < 3 ){
            name = "<Product>";
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3 ){
            name = "<Product>";
        }else {
            this.name = name;
        }
    }

    public void setBrand(String brand) {
        if (brand == null || brand.length()<3){
            this.brand = "<Brand>";
        }else{
            this.brand = brand;
        }
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    String displayInfo(){
        return String.format("%s, %s, %.2f", brand, name, price);
    }


}
