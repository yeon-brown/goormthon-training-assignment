package linkedList;

public class MyLinkedListService {
    public static void main(String[] args) {
        //int list생성
        System.out.println("=====int linkedList생성=====");
        MyLinkedList<Integer> myList=new MyLinkedList<>();

        //add
        System.out.println("----add----");
        myList.addMylistElement(0);
        myList.addMylistElement(1);
        myList.addMylistElement(2);
        myList.addMylistElement(3);
        myList.addMylistElement(4);
        myList.toStringMylist();

        //get
        System.out.println("----get----");
        System.out.println(myList.getMylistElement(2));
        System.out.println(myList.getMylistElement(4));
        myList.toStringMylist();

        //delete
        System.out.println("----delete----");
        myList.deleteMylistElement(1);
        myList.deleteMylistElement(3);
        myList.toStringMylist();

        //int list생성
        System.out.println("=====int linkedList생성=====");
        MyLinkedList<String> myList1=new MyLinkedList<>();

        //add
        System.out.println("----add----");
        myList1.addMylistElement("a");
        myList1.addMylistElement("b");
        myList1.addMylistElement("c");
        myList1.addMylistElement("d");
        myList1.addMylistElement("e");
        myList1.toStringMylist();

        //get
        System.out.println("----get----");
        System.out.println(myList1.getMylistElement(2));
        System.out.println(myList1.getMylistElement(4));
        myList1.toStringMylist();

        //delete
        System.out.println("----delete----");
        myList1.deleteMylistElement(1);
        myList1.deleteMylistElement(3);
        myList1.toStringMylist();
    }
}
