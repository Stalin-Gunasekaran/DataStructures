package com.easy;
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {

      for(int i = digits.length-1; i >=0; i--){
          // INCREMENT AND RETURN IF THE LAST ELEMENT NOT 9
          if(digits[i] < 9){
              digits[i]= digits[i]+1;
              return digits;
          //TURN INTO 0 IF ANY 9 FOUND
          } else  {
              digits[i]=0;
            }
      }
            // IF EVERY NUMBER WAS 9 IN THE ARRAY CREATING A NEW ARRAY
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            return arr;
    }
}
public class PlusOne {
    public static void main(String[] args) {

        //GETTING USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        Solution solution = new Solution();
        // PASSING THE ARRAY TO A METHOD
        System.out.println(Arrays.toString(solution.plusOne(arr)));

    }
}
