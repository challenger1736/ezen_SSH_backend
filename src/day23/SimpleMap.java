package day23;

import java.util.Arrays;

public class SimpleMap <K,V>{
    public Object[] keyarray;
    public Object[] valuearray;
    private int size;

    public SimpleMap(){
        keyarray = new Object[0];
        valuearray = new Object[0];
    }
    public void put(K k,V v){ //put 기능
        this.size++;
        Object[] newkeyArray = new Object[size];

        for (int i = 0; i < this.keyarray.length; i++) {
            if(keyarray[i] == k){
                System.out.println("중복된 키 값입니다.");
                return;
            };
        }
        for (int i = 0; i < this.keyarray.length; i++) {
            newkeyArray[i] = keyarray[i];
        }
        keyarray = newkeyArray;
        keyarray[size - 1] = k;

        Object[] newvalueArray = new Object[size];
        for (int i = 0; i < this.valuearray.length; i++) {
            newvalueArray[i] = valuearray[i];
        }
        valuearray = newvalueArray;
        valuearray[size - 1] = v;
    } // put 기능 끝

    public V get(K k){
        V v = null;
        for (int i = 0; i < this.keyarray.length; i++) {
             if(keyarray[i] == k){
                 v = (V)valuearray[i];
                 return v;
             };
        }
        return v; // 리턴을 밸류로
    }

    public void remove(K k){
        this.size--;
        Object[] newkeyArray = new Object[size];

        int removeindex = -1;
        for (int i = 0; i < this.keyarray.length; i++) {
            if(keyarray[i]==k){
                removeindex = i;
            };
            // 삭제 : 삭제할 인덱스 빼고 카피.
        }

        int j = 0;
        for (int i = 0; i < this.keyarray.length; i++) {
            newkeyArray[j] = keyarray[i];// 0 0 1 1
//            System.out.println("새배열 :" +j);
//            System.out.println("기존 배열:"+i);
//            System.out.println(removeindex);
            // 삭제 : 삭제할 인덱스 빼고 카피.
            if( i != removeindex) {
                j++;
            }
        }
        keyarray = newkeyArray;


        Object[] newvalueArray = new Object[size];
        j = 0;
        for (int i = 0; i < this.valuearray.length; i++) {
            newvalueArray[j] = valuearray[i];
            // 삭제 : 삭제할 인덱스 빼고 카피.
            if( i != removeindex) {
                j++;
            }
        }
        valuearray = newvalueArray;
    }

    public int size(){
        return this.size; }// 혹은 this.array.length


    @Override
    public String toString() {
        return "SimpleMap{" +
                "keyarray=" + Arrays.toString(keyarray) +
                ", valuearray=" + Arrays.toString(valuearray) +
                ", size=" + size +
                '}';
    }
}
