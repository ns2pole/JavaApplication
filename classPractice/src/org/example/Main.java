package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //メニューを生成
        Menu cafe_au_lait = new Menu(500, "Cafe au lait");
        Menu coffee = new Menu(400, "coffee");
        Menu anpan = new Menu(300, "あんぱん");

        List<Menu> menuList1 = List.of(cafe_au_lait, coffee, anpan);
        List<Menu> menuList2 = List.of(cafe_au_lait, coffee);
        List<Menu> menuList3 = List.of(coffee);

        //お店の卓の設定
        Shop shop = new Shop(List.of(
                new Table(0),
                new Table(1),
                new Table(2),
                new Table(3),
                new Table(4)
        ));

        //注文の生成と利用卓の登録
        Order order1 = new Order(menuList1, 2, 2);
        shop.tables.get(order1.tableNum).isUsing = true;
        Order order2 = new Order(menuList2, 2, 3);
        shop.tables.get(order2.tableNum).isUsing = true;
        Order order3 = new Order(menuList3, 1, 4);
        shop.tables.get(order3.tableNum).isUsing = true;

        //支払い処理
        order2.isPaid = true;
        shop.tables.get(order2.tableNum).isUsing = false;

        //金額計算
        System.out.println(order1.getTotalAmount());
        System.out.println(order2.getTotalAmount());

        System.out.println(Arrays.toString(shop.getUsingTableNumbers()));
    }
}