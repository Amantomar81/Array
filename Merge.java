/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Input Format

n1 & n2 (represents the size of arrays, arr1 and arr2)
User inputs in arr1 and arr2
Constraints

arr1.length == x
arr2.length == y
0 <= x <= 1000
0 <= y <= 1000
z <= x + y <= 2000
Output Format

Input: n1 = 2, n2 = 2, arr1 = [5,6], arr2 = [7,8]
Output: 6.5
Explanation: merged array = [5,6,7,8] and median is (6 + 7) / 2 = 6.5.
Sample Input 0

2
1
1 3
2
Sample Output 0

2.0
 */
import java.io.*;
import java.util.*;

 public class Merge {                                              //nums1 = 3     nums2 =2

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[0];
            int x = m + n;
            arr3 = new int[x];
            for (int i = 0; i < arr3.length; i++) {
                if (i < m) {
                    arr3[i] = arr1[i];
                } else {
                    arr3[i] = arr2[i - m];
                }
            }

        Arrays.sort(arr3);
        double median;
        if (arr3.length % 2 == 0) {
            int k = arr3.length / 2 - 1;
            int a = k + 1;
            double sum = (arr3[k] + arr3[a]);
            median = sum / 2;
            System.out.println(median);
        }
        else {
            int k = arr3.length / 2;
            median = arr3[k];
            System.out.println(median);
        }

    }
}
