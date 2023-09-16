package Notebook;

public class Notebook {
    private String name;
    private int ozu;
    private int hd_capacity;
    private String os;
    private String color;

    public Notebook(String name, int ozu, int hd_capacity, String os, String color){
        this.name = name;
        this.ozu = ozu;
        this.hd_capacity = hd_capacity;
        this.os = os;
        this.color = color;

    }

    static String getByOZU_capacity(int ozu, int hd_capacity){
        if ()
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ozu = " + ozu +
                ", hd_capacity = " + hd_capacity +
                ", os = " + os + '\'' +
                ", color = " + color + '\'' +
                '}';
    }
}
