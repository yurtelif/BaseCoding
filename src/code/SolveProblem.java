package code;

public class SolveProblem {

    public static void main(String[] args) {

    }

    /*
      brute force solution
      it is not the best because there is a nested loop
      so time complexity is O(m^n )
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
     */
    private boolean containCommonItem2(String[] arr1, String[] arr2){
        return false;
    }

}
