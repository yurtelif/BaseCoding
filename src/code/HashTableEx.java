package code;

import java.util.HashSet;

public class HashTableEx {

    public static void main(String[] args) {

        int[] input = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        getFirstRecurring(input);

    }

    private static void getFirstRecurring(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                System.out.println("first recurring number: " + i);
                return;
            }
        }
        System.out.println("there is not");
    }

}
