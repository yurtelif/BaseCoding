# **Big O Rules**

1. Worst case
2. Drop the constants

       O(n+100) = O(n)  O(3n) = O(n)

3. Different terms for inputs

```java
private void compressBoxes(ArrayList<String> boxes1, ArrayList<String> boxes2){
        for (String s1 : boxes1) {
            System.out.println("compressed");
            //works n times
        }
        for (String s2 : boxes2) {
            System.out.println("compressed");
            //works m times
        }
    }
```
   Complexity is O(n+m)
   
4. Drop Non Dominants

       O(n^2 + 2n +100) = O(n^2)  

https://www.bigocheatsheet.com/ 