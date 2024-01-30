package day21;

public class Step1 {

    public static void main(String[] args){
        try {
            findClass();
        }catch (ClassNotFoundException e){}
    }

    public static void findClass() throws ClassNotFoundException{
        // *예외 발생.
            // 1. try{}catch(){}    :
        try {
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){}
            // 2. throws            :
        Class.forName("java.lang.String");
    }
}
