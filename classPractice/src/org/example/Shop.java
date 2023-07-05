package org.example;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Table> tables;

    Shop(List<Table> tables) {
        this.tables = tables;
    }

    public int[] getUsingTableNumbers() {
        List<Integer> usingTableNumbers = new ArrayList<Integer>();
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).isUsing) {
                usingTableNumbers.add(tables.get(i).number);
            }
        }
        return usingTableNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
