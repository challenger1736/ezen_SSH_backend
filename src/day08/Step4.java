package day08;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Phone[] phoneBook = new Phone[100]; // 반복문 밖에 phoneBook을 만든다.
            // 등록전: null X 100

        while (true){

            for(int i = 0; i< phoneBook.length ; i++){
                if(phoneBook[i] != null){
                    System.out.printf("%3d \t %5s \t %12s \n", (i+1), phoneBook[i].getName(), phoneBook[i].getNumber() );
                }//private으로 필드를 바꾼후에 .name을 못쓰니까 게터 세터 써서 getName으로 이름을 불러온것. 폰넘버도 마찬가지
            }

            System.out.println("1.등록 2.삭제 선택 > ");
            int ch = scanner.nextInt();

            if(ch==1){
                // 1. 입력 받기
                System.out.print("이름 : ");  String name = scanner.next();
                System.out.print("전화번호 : ");  String number = scanner.next();
                // 2. 객체 생성한다.
                    // 필드는 객체가 없으면 사용 불가능하다. [ 클래스는 실체가 아니고 설계도기 때문에 설계도를 불러와줘야한다. ]
                    // 객체 생성할때 필드에 값을 넣을꺼야 말꺼야?
                Phone newPhone = new Phone(name, number);
                
                // 3. phoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기.
                for(int i = 0; i<phoneBook.length ; i++){
                    if(phoneBook[i]==null){
                        phoneBook[i] = newPhone;
                        break; // !!! : 빈공간을 찾아서 대입은 1번만 대입했으면 반복 종료.
                    }
                }
            }
            if(ch==2){

                System.out.print("삭제할 순번을 입력하세요. : ");
                int dNo = scanner.nextInt();

                phoneBook[dNo-1] = null;

                for( int i = dNo-1; i<phoneBook.length ; i ++ ) {
                    if(i+1==phoneBook.length)break; //{}로 썼는데 break가 더 가벼워서 나은듯,
                    else{ phoneBook[i] = phoneBook[i+1];}
                    // 만약에 i가 마지막 인덱스이면 +1을 할수없다.
                }
                }

            }
        }

    }

/*
* 
*  메모리 구성
*       이름 과 전화번호를 여러개 저장
*           - 예) '유재석' '010-3333-3333' '강호동' '010-4444-4444'
*       1. 변수
*           String 이름1 = "유재석"  String 전화번호1 = "010-3333-3333"
*           String 이름2 = "강호동"  String 전화번호2 = "010-4444-4444"
*
*       2. 배열 : 동일한 타입의 자료형을 순서대로 나열.[인덱스]
*           //1.
*           String 이름들 = {"유재석","강호동"}
*           String 전화번호들 = {"010-3333-3333", "010-4444-4444"}
*               vs
*           //2.
*           String[] 전화번호부 = { "유재석", "010-3333-3333" ,"강호동" , "010-4444-4444" }
* 
*       3. 문자열 : 모든 데이터를 문자형식으로 해서 하나의 문자열 저장
*           // - 구분자 (많이 쓰인다. 외부데이터 가지고 올때, CSV에서 많이 쓰이는 형식, 엑셀등..)
*           String 전화번호부 = "유재석,010-3333-3333\n강호동,010-4444-4444";
*
*       4. 객체 : 클래스(설계도)[미리 틀 잡기] 기반으로 생성된 메모리
*           - 필드를 이용한 데이터를 구분
*           - 생성자를 이용한 초기화를 할 수 있다.
*           - 메소드를 이용한 행위, 이벤트도 할 수 있다.(아직 배우진 않음)
*
*           // 1. 틀 잡고  [ 클래스 만들기 ]
*           class Phone{ // ??????? : 전화번호 1개에 대한 설계    -> new 여러번하면  여러개를 만들수 있음. -> 그걸 하나씩 배열에 저장,
*               멤버 : 필드(객체의 데이터를 저장하는 공간), 생성자, 메소드
*
*           }
*           // 2. 틀 기준으로 메모리 생성 [ 객체 만들기 ]
*           new Phone();
*
* */

//   [1.조건]
//        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
//        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
//        Phone[] phoneBook = new Phone[100];
//
//    [2.기능구현]
//        1.전화번호 등록
//            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
//        2.전화번호 삭제
//            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
//            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
//                예)
//                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  null
//                        만일 2번 인덱스의 객체 삭제시
//                    0(객체A) 1(객체B) 3(객체D)  null    null
//        3.전화번호 출력
//            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
//            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.
//
//    [3.실행화면]
//        ============= 전화번호부 =============
//        순번     이름      전화번호
//        1       김현수     010-3913-2072
//        2       유재석     010-1234-1234
//        3       강호동     010-7777-7777
//
//        1.전화번호등록 2.전화번호삭제
//        선택>