import java.util.Scanner;

//array declaration as a local variable
//an array declared inside the method or block or constructor is known as local variable

public class Array {
    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= s.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }

    }

}
