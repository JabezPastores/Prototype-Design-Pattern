public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Kindred");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();


        sheep1.makeSound();
        System.out.println(sheep1.getType() + "\n");
        

        cow1.makeSound();
        System.out.println(cow1.getType() + "\n");

        horse1.makeSound();
        System.out.println(horse1.getType() + "\n");
    }
}