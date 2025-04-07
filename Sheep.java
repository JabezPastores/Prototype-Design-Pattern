// Sheep.java
public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs(){
        return legs;
    }

    public String getSound(){
        return this.sound;
    }

    public String getFood(){
        return this.food;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public Sheep clone() {
        return new Sheep(legs, sound, food, name);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    
    @Override
    public String getType() {
        return "Sheep";
    }
}