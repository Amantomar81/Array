import java.util.Scanner;
/*
create a class with name Book
create three instance variable with bookID , book name, no. of pages and price
create an array to store 10 book objects and find out the difference between highest and minimum book price and
also complete information of the highest price book and the lowest price book.
 */
public class Book {
    int Book_id;
    String Name;
    int num;
    int price;
    Book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BookID:");
        Book_id = sc.nextInt();
        System.out.println("Enter the Book Name:");
        Name = sc.next();
        System.out.println("Enter the Book page no.:");
        num = sc.nextInt();
        System.out.println("Enter the Book price:");
        price = sc.nextInt();
   }
    public static void main(String[] args) {
        Book arr[] = new Book[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Book();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("BookID:  "+arr[i].Book_id);
            System.out.println("Book Name: "+arr[i].Name);
            System.out.println("Book page numbe: "+arr[i].num);
            System.out.println("Book price: "+arr[i].price);
        }
        int max = arr[0].price;
        int small = arr[0].price;
        int a = 0;
        int b=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].price>max){
                max = arr[i].price;
                a = i;
            }
            if (arr[i].price<small){
                small = arr[i].price;
                b = i;
            }
        }
        System.out.println(max - small);
        System.out.println(arr[a].Book_id);
        System.out.println(arr[a].Name);
        System.out.println(arr[a].num);
        System.out.println(arr[a].price);
        System.out.println(arr[b].Book_id);
        System.out.println(arr[b].Name);
        System.out.println(arr[b].num);
        System.out.println(arr[b].price);
    }
}
