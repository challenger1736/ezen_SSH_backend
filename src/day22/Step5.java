package day22;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {

        //Applicant<T>
            // 왜 T?? 응모자의 타입을 여러개 할려고
        /*
            Applicant<Person> applicant1 ;
            applicant1{
                    public Person kind = person1;
            }
         */
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        // Applicant<Worker>함 public Worker kind 필드가 됨,
        // 그 필드안에 new Worker()가 Worker가 됨

        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

//        Course.registerCourse2(new Applicant<Person>(new Person())); // x
//        Course.registerCourse2(new Applicant<Worker>(new Worker())); // x
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student())); // x
//        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); // x
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent())); // x
         // 라이브러리에 있는 오류만 지원해준다 예를들어 NullPointerException이라는 라이브러리가 있기에 지원을 해주는 것.
        // 위에 애들을 풀어서 보면 ~~~Exception이 뜬다고 안해줌. 라이브러리가 없기 때문에,
        // if
            // 예외 try{}catch(){} vs if(흐름제어) : 검사.
            // 관례적으로 값에 따른 검사, if를 주로 쓰고 vs 데이터 검사의 범위가 광범위한 경우, 미리 만들어진 라이브러리등(외부) try catch
        //Scanner scanner = new Scanner(System.in);
        //scanner.nextInt();
    }
}
