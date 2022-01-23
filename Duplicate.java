import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: 1");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1])
            {
                for (int j = i+1; j < n-1; j++) {
                    arr[j] = arr[j+1];
                }
                n = n-1;
                i = i-1;
            }
        }
        System.out.println("after the removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
/*
Q. Write a program to remove consecutive duplicate elements in an array.

Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45
 */
