package org.example;
import java.util.List;

public class Order {
    List<Menu> menuList;
    int guestNum;
    int tableNum;
    boolean isPaid;

    Order(List<Menu> menuList, int guestNum, int tableNum) {
        this.menuList = menuList;
        this.guestNum = guestNum;
        this.tableNum = tableNum;
        this.isPaid = false;
    }

    public int getTotalAmount() {
        int amount = 0;
        for(int i = 0; i < menuList.size(); i++) {
            amount = amount + menuList.get(i).price;
        }
        return amount;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + "注文メニュー:" + "\n";
        for(int i = 0; i < menuList.size(); i++) {
            str = str + this.menuList.get(i).name + "\n";
        }
        str = str + "卓番:" + this.tableNum + "\n";
        str = str + "人数:" + this.guestNum + "\n";
        str = str + "合計金額:" + this.getTotalAmount();
        return str;
    }
}
