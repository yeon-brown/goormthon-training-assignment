package linkedList;

import java.util.ArrayList;

public class MyLinkedList<T> {
    private ArrayList<T> myLinkedList=new ArrayList<T>();

    public void MyLinkedList(){};
    public void addMylistElement(T data){
        myLinkedList.add(data);
    }
    public T getMylistElement(int index){
        return myLinkedList.get(index);
    }
    public T deleteMylistElement(int index){
        T data=myLinkedList.get(index);
        myLinkedList.remove(index);
        return data;
    }
    public void toStringMylist(){
        for (T data :
                myLinkedList) {
            System.out.println("("+myLinkedList.indexOf(data)+", "+data+") -> ");
        }
    }
}
