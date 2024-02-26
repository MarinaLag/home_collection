package by.learn.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(15);
        list.add(355);
        list.add(null);
        System.out.println(list);
        list.add(0, 0);
        list.remove(4);
        System.out.println(list);
//        list.add(6,66);
//        System.out.println(list);
        System.out.println("=======orders==========");
        List<Order> orders = List.of(new Order(231, 12.f),
                new Order(389, 29f),
                new Order(217, 17));
        orders.forEach(System.out::println);

        System.out.println("=======raw==========");
        List raw = List.of(new Order(231,12.f),
                new ArrayList(),
                new Order(217,17.f),
                "Unitas");

        Order ord1 =(Order) raw.get(0);
        ArrayList ord2 = (ArrayList) raw.get(1);
        Order ord3 = (Order) raw.get(2);
        String ord4 = (String) raw.get(3);
        raw.forEach(System.out::println);
        System.out.println(ord1);

        System.out.println("=======orderList=========");




    }
}
