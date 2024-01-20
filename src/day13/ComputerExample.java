package day13;


public class ComputerExample {
    public static void main(String[] args) {
        int r=10;

        Calculator calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        Computer calculator2 = new Computer();
        System.out.println("원면적 : " + calculator2.areaCircle(r));
    }

}
