package code;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayExamples {

    public static void main(String[] args) {

        String[] strings = new String[]{"a", "b", "c", "d"};
        // 4 elements 4 blocks 4*4=16 bytes of storage

        System.out.println(strings[2]);

        String test = "my name is elif";
        System.out.println(reverseString2(test));

        int[] arr1 = new int[]{1, 5, 12};
        int[] arr2 = new int[]{2, 3, 5, 9, 20};

        System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2)));

        int[] arr3 = new int[]{2,7,11,15};

        System.out.println(Arrays.toString(twoSum(arr3, 9)));
    }

    /**
     * first solution
     */
    private static String reverseString(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }

    /**
     * second solution
     */
    private static String reverseString2(String string) {
        StringBuilder result = new StringBuilder(string);
        return result.reverse().toString();
    }

    private static int[] mergeSortedArray(int[] array1, int[] array2) {
        int arr1Length = array1.length;
        int arr2Length = array2.length;
        int[] result = new int[arr1Length + arr2Length];

        // check inputs
        if (arr1Length == 0) return array2;
        if (arr2Length == 0) return array1;

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1Length && j < arr2Length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        while (i < arr1Length)
            result[k++] = array1[i++];

        while (j < arr2Length)
            result[k++] = array2[j++];

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        //[2,7,11,15]
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                result[0]= hashMap.get(nums[i]);
                result[1]= i;
                break;
            }
            System.out.println(target-nums[i] + " " + i);
            hashMap.put(target-nums[i],i);
        }
        return result;
    }



}
