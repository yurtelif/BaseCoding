package code;

import java.util.HashMap;

public class SolveProblem {

    public static void main(String[] args) {

        String[] array1 = new String[]{"a", "b", "c", "d"};
        String[] array2 = new String[]{"k", "l", "m"};

        System.out.println(containCommonItem2(array1, array2));

    }

    /*
      brute force solution
      it is not the best because there is a nested loop
      so time complexity is O(m^n )
      space complexity O(1)
      private boolean containCommonItem(String[] arr1, String[] arr2){
              for (String s : arr1) {
                  for (String value : arr2) {
                      if (s.equals(value)) return true;
                  }
              }
              return false;
          }
     */


    /**
     * better solution
     * complexity O(m+n) if sizes are equal O(2n) -> O(n)
     * space complexity O(m)
     */
    private static boolean containCommonItem2(String[] arr1, String[] arr2)
    {
        HashMap<String, Boolean> map = new HashMap<>();
        if (arr1 != null && arr2 != null){
            for (String s : arr1) {
                if (!map.containsKey(s)) {
                    map.put(s, true);
                }
            }
            for (String s : arr2) {
                if (map.containsKey(s)) return true;
            }
        }
        return false;
    }

}
