
public class firstConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.emp_ID + "0001" +"\n"+ emp.emp_salary + "2.500.000 kip");
        System.out.println(emp.emp_ID + "0002" +"\n"+ emp.emp_salary + "3.000.000 kip");
    }
}

class Employee {
    public String emp_salary;
    public String emp_ID;

    public Employee() {
        emp_ID = "EmployeeID: ";
        emp_salary = "EmployeeSalary: ";
    }
}
