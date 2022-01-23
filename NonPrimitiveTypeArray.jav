import java.util.Scanner;
// how to creare Array of non primitive data types
class Student1
{
    int rollno1;
    String name1;
    int marks1;
    public Student1(int rollno,String name, int marks)
    {
        this.name1 = name;
        this.marks1 = marks;
        this.rollno1= rollno;
    }
}
public class NonPrimitiveTypeArray {
    public static void main(String[] args) {

        // creating an array that will hold 5 student objects
        Student1 arr[] = new Student1[5];

        // initializing the array with Student object
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= new Student1(s.nextInt(),s.next(),s.nextInt()); // object creation
        }

        // traverse/print all the objects value stored in array
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].rollno1 + "\t" + arr[i].name1+ "\t"+ arr[i].marks1);
        }
    }
}
