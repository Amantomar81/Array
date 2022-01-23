import java.util.Scanner;

/*
Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks.
The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
 */
public class Student {
    private int rollno;
    private int marks;
    private String name;

    Student(int rollno,int marks,String name){
        this.rollno = rollno;
       this.marks = marks;
       this.name = name;
    }

    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(sc.nextInt(),sc.nextInt(),sc.next());
        }
        int max = arr[0].marks;
        int min = arr[0].marks;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].marks){
                max = arr[i].marks;
            }
            if (min > arr[i].marks){
               min = arr[i].marks;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
