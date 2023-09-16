package Sem6;

import java.util.*;

public class Cat {

    private String name;
    private int age;
    private String owner;
    private String poroda;
    private List<String> healthHistory;

    public Cat(String name, int age, String owner, String poroda){
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.poroda = poroda;
        healthHistory = new ArrayList<>();
    }



    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " +  name + ", age: " + age + ", owner: " + owner + ", poroda: " + poroda;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(!(obj instanceof  Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && poroda.equals(cat.poroda);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + owner.hashCode() + poroda.hashCode();
    }
}
