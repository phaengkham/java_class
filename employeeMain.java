public class employeeMain {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.id = "T001";
        emp.name = "xaiykham";
        emp.salary = 1000000.0;
        employee emp1 = new employee();
        emp1.id = "T002";
        emp1.name = "dom";
        emp1.salary = 200000.0;
        System.out.println("Show empoyee id: " + emp.id);
        System.out.println("Show employee name: " + emp.name);
        System.out.println("Show employee salary: " + emp.salary);

        System.out.println("Show empoyee id: " + emp1.id);
        System.out.println("Show employee name: " + emp1.name);
        System.out.println("Show employee salary: " + emp1.salary);
    }
}
