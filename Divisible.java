import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[n];
        int first = 0;
        int last = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%5==0){
                arr1[last--] = arr[i];
            }
            else{
                arr1[first++]=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
