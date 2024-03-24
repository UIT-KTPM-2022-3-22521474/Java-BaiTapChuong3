package BT2;

import MyUtils.stringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBT2 - Enum & Random - Shirt Information - To Vinh Tien - 22521474.\n");
        Random random = new Random();
        int N = random.nextInt(11) + 5;
        List<Shirt> shirts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Color randomColor = Color.values()[random.nextInt(Color.values().length)];
            Size randomSize = Size.values()[random.nextInt(Size.values().length)];
            shirts.add(new Shirt(randomColor, randomSize));
        }

        for (int i = 0; i < shirts.size(); i++) {
            System.out.println(STR."The \{stringUtils.getOrdinal(i + 1)} shirt information: \{shirts.get(i)}.");
        }
    }
}