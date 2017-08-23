/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevejobs
 */
public class Solution {

    public boolean ArrayContainsValue(int arr[], int value) {
        //int[]arr={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }

        return false;
    } // end function ArrayContainsValue()

    public int[] CommonNumbersInArrays(int ar1[], int ar2[], int ar3[]) {
        int length = 0;
        if (ar1.length > ar2.length) {
            length = ar1.length;
        } else {
            length = ar2.length;
        }

        if (ar3.length > length) {
            length = ar3.length;
        }
        int[] common = new int[length];
        int index = 0;

        for (int i = 0; i < ar1.length; i++) {
            if (ArrayContainsValue(ar2, ar1[i]) && ArrayContainsValue(ar3, ar1[i])) {
                common[index] = ar1[i];
                index++;
            }
        }

        for (int i = 0; i < ar2.length; i++) {
            if (ArrayContainsValue(ar1, ar2[i]) && ArrayContainsValue(ar3, ar2[i]) && !ArrayContainsValue(common, ar2[i])) {
                common[index] = ar1[i];
                index++;
            }
        }

        for (int i = 0; i < ar3.length; i++) {
            if (ArrayContainsValue(ar1, ar3[i]) && ArrayContainsValue(ar2, ar3[i]) && !ArrayContainsValue(common, ar3[i])) {
                common[index] = ar1[i];
                index++;
            }
        }

        return common;
    }

    public static boolean NumberIsPalindrome(float number) {
        String numberString = number + "";
        numberString = numberString.replace(".", "");
        int palindrome = Integer.parseInt(numberString);
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }//end function

    public boolean isPalindrome(String s) {
        s = s.replaceAll("'", "");
        s = s.replaceAll(";", "");
        s = s.replaceAll(":", "");
        s = s.replaceAll("!", "");
        s = s.replaceAll("\"", "");
        s = s.replaceAll(",", "");
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

}//end class
