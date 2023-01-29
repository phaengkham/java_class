import java.util.Scanner;

public class classMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        firstMethod fmd = new firstMethod();
        fmd.showData("phaengkham");
        fmd.showData("baby");
        fmd.selectMenu();
        fmd.OddEven();
        Employee emp = new Employee();
        System.out.println(emp.emp_ID + "0001" + "\n" + emp.emp_salary + "2.500.000 kip");
        System.out.println(emp.emp_ID + "0002" + "\n" + emp.emp_salary + "3.000.000 kip");

    }
}
