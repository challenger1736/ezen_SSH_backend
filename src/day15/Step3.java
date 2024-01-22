package day15;

public class Step3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());

        Animal dog1 = new Dog();
        animalSound(dog1);

    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
