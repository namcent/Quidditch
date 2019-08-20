package main.java.Utils;

import java.util.List;
import java.util.Random;

public class Functions {
    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
