package OOP_Sem2.sample1;

public abstract class Animal {
    private String name;

    public abstract void voice();
    public void jump(){
        System.out.println("Животное прыгнуло");
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
    }
    public Animal(String name){
    }
}
