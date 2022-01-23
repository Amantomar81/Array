import java.util.Scanner;
/*
Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
 (d) display the scores obtained by every student.
 */
public class Marks {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4 ; i++) {
            System.out.print("Enter Marks of "+(i+1)+" student marks of five subjects : ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //average marks of every student
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[j][i];
            }
            double avg = sum/4;
            System.out.println("Average marks in subject "+(i+1)+" : "+avg);
        }
        System.out.println();
        // average marks obtained by each student
        for (int i = 0; i < 4; i++) {
            int sum =0;
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            double avg = sum/5;
            System.out.println("Average marks of Student "+(i+1)+" : "+avg);
        }
        System.out.println();
        // Students who have scored below 50 in their average
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            double avg = sum/5;
            if (avg<50){
                System.out.println("Student "+(i+1)+" have scored below 50 in his average");
            }
        }
        System.out.println();
        // display the score of every student
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
            System.out.println("Score of Student "+(i+1)+" : "+sum);
        }
    }
}
