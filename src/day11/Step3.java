package day11;

public class Step3 {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();
        // 안된다. 외부로부터 생성못하게 private을 했기 때문에,

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);

    }
}
