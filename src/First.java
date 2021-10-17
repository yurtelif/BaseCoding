import java.util.ArrayList;
import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        String[] array = new String[]{"nemo"};
        String[] array2 = new String[]{"frodo", "sam", "gandalf", "aragorn", "legolas",
                "nemo", "pippin", "merry", "gimli", "boramir"};
        String [] largeArray = new String[100000];
        Arrays.fill(largeArray, "nemo");
        findNemo(array);
        findNemo(largeArray);
    }

    private static void findNemo(String[] array) {
        long startTime = System.nanoTime();
        for (String s : array) {
            if (s.equals("nemo")) {
                System.out.println("found nemo");
                break;
            }
        }
        long stopTime = System.nanoTime();
        System.out.println("runtime " + (stopTime-startTime));

    }

    private void compressBoxes(ArrayList<String> boxes1, ArrayList<String> boxes2){
        for (String s1 : boxes1) {
            // runs n times
            System.out.println("compressed");
        }
        for (String s2 : boxes2) {
            // runs m times
            System.out.println("compressed");
        }
        // complexity O(n+m)
    }

    private void logPairsOfArray(){
        int[] boxes = new int[]{1,2,3,4,5};
        for (int i = 0; i < boxes.length-1; i++) {
            for (int j = i+1; j < boxes.length; j++) {
                System.out.println(boxes[i] + " with " + boxes[j ]);
            }
        }
        // complexity O(n*(n-1)) = O(n^2 + 2n) = o(n^2)
    }


}
