package day15;



public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void breathe() {
        super.breathe();
    }
}
