package day23;

import java.util.Arrays;

public class SimpleList <제네릭> {
    //1.ㅍㄷ
    public Object[] array;
    private int size;

    //2.ㅅㅅㅈ
    public SimpleList(){
        array = new Object[0];
    }
    //3.ㅁㅅㄷ
        // 1. 삽입 메소드
    public boolean add( 제네릭 element){
        try {
            // 1. 배열의 사이즈 증가.
            this.size++;
            // 2. 배열 길이의 마지막인덱스의 매개변수 저장.
            // 배열 메모리 재할당해서 가변길이 만들기.
            // 1. 현재 size 만큼 배열 선언
            Object[] newArray = new Object[size];
            // 2. 배열 복사 : 기존 배열에 있던 객체들을 새로운 배열에 저장.
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = array[i];
            }
            // 3. 기존 배열필드에 새로운 배열 대입
            array = newArray;
            // 4. 마지막 인덱스의 매개변수 대입
            array[size - 1] = element;
            return true;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            //혹은
            System.out.println(e);
            return false;
        }

    }
        // 2. 호출 메소드
    public 제네릭 get(int index){
        return (제네릭)this.array[index];
    }
        // 3. 삭제 메소드
    public boolean remove(int index){
        // 1. 배열의 사이즈 감소
        this.size--;
        // 2.
        Object[] newArray = new Object[size];
        // 3. 배열 복사
            // i : 기존배열 인덱스 // j : 새로운 배열 인덱스
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            newArray[j] = array[i];
            // 삭제 : 삭제할 인덱스 빼고 카피.
            if(i != index){ // 강사님은 i != index로 쓰심.
                j++;
            }
        }
        array = newArray;
        //copy로 해보기.
        //System.arraycopy(원본배열, 원본배열의 시작인덱스, 복사할 배열, 목표배열의 시작인덱스, 복사할 요소의 개수);

//        System.arraycopy(array, 0, newArray, 0, index+1); // 받은 값 +1 까지 복사 (갯수 복사)
//        System.arraycopy(array, index+1, newArray, index+1, this.size); // 받은 값 +1 까지 복사 (갯수 복사)
//        array = newArray;
        // 검증 중...ing

        return true;
    }

        // 4. 현재 길이를 출력하는 메소드
    public int size(){
        return this.size; // 혹은 this.array.length
    }
        // 5. toString 메소드


    @Override
    public String toString() {
//       String str = "객체 힙 주소 대신에 출력할 내용물";
        String str = "[";
        for(int i=0 ; i<this.array.length; i++){
            str += array[i].toString();
            // 마지막 인덱스가 아니면 뒤에, 추가
            str += i!= this.array.length-1 ? ", " : "";
        }
       return str+"]";
    }
}
