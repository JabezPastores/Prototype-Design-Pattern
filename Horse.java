// Horse.java
public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    public int getLegs(){
        return this.legs;
    }

    public String getSound(){
        return this.sound;
    }

    public String getFood(){
        return this.food;
    }

    public String getColor(){
        return this.color;
    }


    @Override
    public Horse clone() {
        return new Horse(legs, sound, food, color);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}