package shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class shoppingService {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        Set<Item> itemList = new HashSet<>();

        Item milk1 = new Item("우유", 3900);
        Item milk2= new Item("우유", 3900);
        Item milk3 = new Item("우유", 3900);
        Item sausages = new Item("소세지", 4500);
        Item chestnut = new Item("맛밤", 2500);
        Item ramen = new Item("신라면", 1500);
        Item tiramisu = new Item("티라미수", 4800);

        itemList.add(milk1);
        itemList.add(milk2);
        itemList.add(milk3);
        itemList.add(sausages);
        itemList.add(chestnut);
        itemList.add(ramen);
        itemList.add(tiramisu);

        System.out.println("\n \n========주문가능한 상품 목록========");
        for (Item item :
                itemList) {
            System.out.println(item.getItemName() + " " + item.getItemPrice() + "원");
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Cart shoppingCart = new Cart();
        outer:
        while(true){
            System.out.println("\n \n장바구니 어플입니다. \n 아래 메뉴를 보고 실행하실 메뉴의 번호를 입력해주세요.");
            System.out.println("===================");
            System.out.println("1. 장바구니에 담기");
            System.out.println("2. 장바구니에서 상품 빼기");
            System.out.println("3. 장바구니에 담긴 상품목록 조회");
            System.out.println("4. 앱 종료");

            StringTokenizer input = new StringTokenizer(br.readLine());
            int menu = Integer.parseInt(input.nextToken());
            inner:
            switch (menu){
                case 1:
                    System.out.println("\n \n장바구니에 담으실 상품 이름과 개수를 차례로 입력해주세요.");
                    input = new StringTokenizer(br.readLine());
                    String name = input.nextToken();
                    int count = Integer.parseInt(input.nextToken());
                    Item item = null;
                    for (Item item1 :
                            itemList) {
                        if (item1.getItemName().equals(name)){
                            item = item1;
                        }
                    }
                    shoppingCart.addProduct(item, count);
                    break inner;
                case 2:
                    System.out.println("\n \n장바구니에서 삭제하실 상품 이름과 개수를 차례로 입력해주세요.");
                    input = new StringTokenizer(br.readLine());
                    String name2 = input.nextToken();
                    int count2 = Integer.parseInt(input.nextToken());
                    Item item2 = null;
                    for (Item item1 :
                            itemList) {
                        if (item1.getItemName().equals(name2)){
                            item2 = item1;
                        }
                    }
                    shoppingCart.removeProduct(item2, count2);
                    break inner;
                case 3:
                    shoppingCart.showItems();
                    break inner;
                case 4:
                    System.out.println("종료되었습니다");
                    break outer;
            }
        }


    }
}
