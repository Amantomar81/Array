import java.util.Scanner;
/*
create class Employee
create three attributes are available Name,ID,salary
array create 10 employee record out of second highest salary print from all ten employee
 */
public class Employee {
    String Name;
    int ID;
    int salary;
    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        Name = sc.next();
        System.out.println("Enter the ID:");
        ID = sc.nextInt();
        System.out.println("Enter the salary:");
        salary = sc.nextInt();
    }
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new Employee();
        }
        int s_max;
        int max =  s_max =  arr[0].salary;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].salary)
            {
                s_max = max;
                max = arr[i].salary;
            }
            else if (s_max<arr[i].salary && arr[i].salary != s_max){
                s_max = arr[i].salary;
            }
        }
        System.out.println("second highest sallary getter:"+s_max);

    }
}
