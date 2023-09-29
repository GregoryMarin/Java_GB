package OOP_Sem2;

import OOP_Sem2.sample1.Animal;
import OOP_Sem2.sample1.Cat;
import OOP_Sem2.sample1.Dog;

public class Program {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Persic");
        cat1.setColor("Orange");
        System.out.println(cat1.getName());

        Dog dog1 = new Dog();

        Animal cat2 = new Cat("Tiger");
        cat1.setColor("Brown");
        Animal dog2 = new Dog();

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = dog1;
        animals[2] = cat2;
        animals[3] = dog2;

        processVoice(animals);

    }

    public static void processVoice(Animal[] animals){
        for (Animal animal: animals) {
            animal.voice();
        }
    }
}
