public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
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

    @Override
    public Cow clone() {
        return new Cow(legs, sound, food);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}